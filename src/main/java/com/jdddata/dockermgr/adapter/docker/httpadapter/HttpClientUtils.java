package com.jdddata.dockermgr.adapter.docker.httpadapter;

import com.jdddata.dockermgr.adapter.docker.httpadapter.sslconfig.LocalDirectorySSLConfig;
import org.apache.http.HttpEntity;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.*;
import org.apache.http.conn.ssl.*;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.ClassUtils;
import org.springframework.util.StringUtils;

import javax.net.ssl.SSLContext;
import java.io.*;
import java.net.URI;
import java.nio.charset.Charset;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 *
 */
public class HttpClientUtils {

    private static Logger LOG = LoggerFactory.getLogger(HttpClientUtils.class);

    private static final String DEFAULTCHARSET = "UTF-8";

    /**
     * 连接池
     */
    private static PoolingHttpClientConnectionManager connectionManager;
    /**
     * 请求配置
     */
    private static RequestConfig requestConfig;
    /**
     * 超时时间
     */
    private static final int MAX_TIMEOUT = 360000;

    static {
        connectionManager = new PoolingHttpClientConnectionManager();
        //设置连接池大小
        connectionManager.setMaxTotal(20);
        connectionManager.setDefaultMaxPerRoute(connectionManager.getMaxTotal());
        //设置请求参数配置
        RequestConfig.Builder configBuilder = RequestConfig.custom();
        //设置连接超时
        configBuilder.setConnectTimeout(MAX_TIMEOUT);
        //设置读取超时
        configBuilder.setSocketTimeout(MAX_TIMEOUT);
        //设置从连接池获取连接实例的超时
        configBuilder.setConnectionRequestTimeout(MAX_TIMEOUT);
        requestConfig = configBuilder.build();
    }

    private HttpClientUtils() {

    }

    public static HttpResponse getWithCert(String url) {
        HttpGet httpGet = new HttpGet(url);
        httpGet.setConfig(requestConfig);
        return send(httpGet);
    }
    public static HttpResponse getWithCert(String url, Map<String, Object> params) {

        HttpResponse response = null;
        try {
            HttpGet httpGet = new HttpGet(url);
            httpGet.setConfig(requestConfig);
            if (params != null && params.size() > 0) {
                //将map转化为BasicNameValuePair
                List<BasicNameValuePair> pairList = convertBasicPairList(params);
                UrlEncodedFormEntity urlEncodedFormEntity=new UrlEncodedFormEntity(pairList, DEFAULTCHARSET);
                String str = EntityUtils.toString(urlEncodedFormEntity);
                httpGet.setURI(new URI(httpGet.getURI().toString() + "?" + str));
            }
            response = send(httpGet);
        }catch (Exception e){
            LOG.error("参数解析出错",e);
        }
        return response;
    }

    public static HttpResponse deleteWithCert(String url) {
        HttpDelete httpDelete = new HttpDelete(url);
        httpDelete.setConfig(requestConfig);
        return send(httpDelete);
    }

    public static HttpResponse putRawWithCert(String url, String stringJson) {
        return putRawWithCert(url, stringJson, null, DEFAULTCHARSET);
    }

    /**
     * 发送 http put 请求，参数以原生字符串进行提交
     *
     * @param url
     * @param encode
     * @return
     */
    public static HttpResponse putRawWithCert(String url, String stringJson, Map<String, String> headers, String encode) {
        HttpPut httpput = new HttpPut(url);
        //设置header
        httpput.setHeader("Content-type", "application/json");
        if (headers != null && headers.size() > 0) {
            for (Map.Entry<String, String> entry : headers.entrySet()) {
                httpput.setHeader(entry.getKey(), entry.getValue());
            }
        }
        //组织请求参数
        StringEntity stringEntity = new StringEntity(stringJson, encode);
        httpput.setEntity(stringEntity);
        return send(httpput);
    }

    public static HttpResponse postWithCert(String apiUrl, Map<String, Object> params) {
        return postWithCert(apiUrl, params, DEFAULTCHARSET, null);
    }

    /**
     * 调用httpPost请求
     *
     * @param apiUrl 请求地址
     * @param params 请求参数
     * @return 返回结果string
     */
    public static HttpResponse postWithCert(String apiUrl, Map<String, Object> params, String charset, String contentType) {
        HttpResponse httpClientResponse = null;
        HttpPost httpPost = new HttpPost(apiUrl);
        httpPost.setConfig(requestConfig);
        if (params != null && params.size() > 0) {
            //将map转化为BasicNameValuePair
            List<BasicNameValuePair> pairList = convertBasicPairList(params);
            UrlEncodedFormEntity urlEncodedFormEntity = null;
            try {
                urlEncodedFormEntity = new UrlEncodedFormEntity(pairList, charset);
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
            if (contentType != null) {
                urlEncodedFormEntity.setContentType(contentType);
            }
            httpPost.setEntity(urlEncodedFormEntity);
        }
        return send(httpPost);
    }

    /**
     * 方法描述：
     * 作者：zhd37930
     *
     * @param apiUrl
     * @param context
     * @return
     */
    public static HttpResponse postRawWithCert(String apiUrl, String context) {
        return postRawWithCert(apiUrl, context, DEFAULTCHARSET, "application/json");
    }

    /**
     * 方法描述：
     * 作者：zhd37930
     *
     * @param apiUrl
     * @param context
     * @param contentType 头文件格式
     * @return
     */
    public static HttpResponse postRawWithCert(String apiUrl, String context, String charset, String contentType) {
        HttpResponse httpResponse = null;
        HttpPost httpPost = new HttpPost(apiUrl);
        httpPost.setConfig(requestConfig);
        StringEntity stringEntity = new StringEntity(context, Charset.forName(charset));
        if (!StringUtils.isEmpty(contentType)) {
            //post传输是json格式数据
            stringEntity.setContentType(contentType);
        }
        httpPost.setEntity(stringEntity);
        return send(httpPost);

    }

    public static String doPostWithHttps(String apiUrl, String context,String charset,String contentType ) {
        CloseableHttpClient httpClient = createClientSSLDefault();
        String httpStr = null;
        CloseableHttpResponse response = null;
        HttpPost httpPost = new HttpPost(apiUrl);
        try {
            httpPost.setConfig(requestConfig);
            StringEntity stringEntity = new StringEntity(context, Charset.forName(charset));
            if(!StringUtils.isEmpty(contentType)){
                /*post传输是json格式数据*/
                stringEntity.setContentType(contentType);
            }
            httpPost.setEntity(stringEntity);
            response = httpClient.execute(httpPost);
            HttpEntity entity = response.getEntity();
            httpStr = EntityUtils.toString(entity, charset);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (response != null) {
                try {
                    EntityUtils.consume(response.getEntity());
                } catch (IOException e) {

                }
            }
        }
        return httpStr;
    }

    /**
     * 无证书验证 CloseableHttpClient
     *
     * @return
     */
    private static CloseableHttpClient createClientSSLDefault() {
        try {
            SSLContext sslContext = new SSLContextBuilder().loadTrustMaterial(null, new TrustStrategy() {
                //信任所有
                @Override
                public boolean isTrusted(X509Certificate[] chain, String authType) throws CertificateException {
                    return true;
                }
            }).build();
            SSLConnectionSocketFactory sslsf = new SSLConnectionSocketFactory(sslContext, new String[]{"TLSv1"}, null,
                    SSLConnectionSocketFactory.ALLOW_ALL_HOSTNAME_VERIFIER);
            return HttpClients.custom().setSSLSocketFactory(sslsf).build();
        } catch (KeyManagementException e) {
            e.printStackTrace();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (KeyStoreException e) {
            e.printStackTrace();
        }
        return HttpClients.createDefault();
    }

    /**
     * 有证书验证
     *
     * @param file
     * @return
     * @throws Exception
     */
    private static CloseableHttpClient clientCustomSSL(File file) throws Exception {

        KeyStore trustStore = KeyStore.getInstance(KeyStore.getDefaultType());
        FileInputStream instream = new FileInputStream(file);

        try {
            trustStore.load(instream, "nopassword".toCharArray());
        } finally {
            instream.close();
        }
        // Trust own CA and all self-signed certs
        SSLContext sslcontext = SSLContexts.custom().loadTrustMaterial(trustStore, new TrustSelfSignedStrategy()).build();
        // Allow TLSv1 protocol only
        SSLConnectionSocketFactory sslsf = new SSLConnectionSocketFactory(sslcontext, new String[]{"TLSv1"}, null,
                SSLConnectionSocketFactory.BROWSER_COMPATIBLE_HOSTNAME_VERIFIER);
        CloseableHttpClient httpclient = HttpClients.custom().setSSLSocketFactory(sslsf).build();

        return httpclient;
    }

    private static CloseableHttpClient clientCustomPemSSL() throws Exception {
        String filePath = ClassUtils.getDefaultClassLoader().getResource("cert").getPath().substring(1);
        LocalDirectorySSLConfig localDirectorySSLConfig = new LocalDirectorySSLConfig(filePath);
        SSLContext sslcontext = localDirectorySSLConfig.getSSLContext();
        // Allow TLSv1 protocol only
        SSLConnectionSocketFactory sslsf = new SSLConnectionSocketFactory(sslcontext, new String[]{"TLSv1.2"}, null,
                SSLConnectionSocketFactory.BROWSER_COMPATIBLE_HOSTNAME_VERIFIER);
        CloseableHttpClient httpclient = HttpClients.custom().setSSLSocketFactory(sslsf).build();

        return httpclient;
    }

    private static List<BasicNameValuePair> convertBasicPairList(Map<String, Object> map) {
        List<BasicNameValuePair> pairList = new ArrayList<BasicNameValuePair>();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            BasicNameValuePair pair = new BasicNameValuePair(entry.getKey(), entry.getValue().toString());
            pairList.add(pair);
        }
        return pairList;
    }

    private static HttpResponse send(HttpUriRequest request) {
        HttpResponse httpResponse = null;
        CloseableHttpResponse response = null;
        try {
            CloseableHttpClient httpClient = clientCustomPemSSL();
            response = httpClient.execute(request);
            HttpEntity entity = response.getEntity();
            String httpStr =null;
            if(!Objects.isNull(entity)){
                httpStr = EntityUtils.toString(entity, DEFAULTCHARSET);
            }
            httpResponse = new HttpResponse(response.getStatusLine().getStatusCode(), httpStr, response.getAllHeaders());
        } catch (Exception e) {
            LOG.error(e.getMessage(), e);
        } finally {
            if (response != null) {
                try {

                    EntityUtils.consume(response.getEntity());
                } catch (IOException e) {
                    LOG.error(e.getMessage(), e);
                }
            }
        }

        return httpResponse;
    }

    public static DataInputStream getStreamWithcert(String url) {
        try {
            HttpGet httpGet = new HttpGet(url);
            httpGet.setConfig(requestConfig);
            CloseableHttpClient httpClient = clientCustomPemSSL();
            CloseableHttpResponse execute = httpClient.execute(httpGet);
            HttpEntity entity = execute.getEntity();
            InputStream content = entity.getContent();
            DataInputStream dataInputStream = new DataInputStream(content);
            return dataInputStream;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}
