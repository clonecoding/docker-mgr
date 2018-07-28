package com.jdddata.dockermgr.common.util;

import org.apache.commons.lang3.StringUtils;
import org.apache.http.HttpEntity;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.ssl.*;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.net.ssl.SSLContext;
import javax.xml.bind.DatatypeConverter;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
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

/**
 * @Author: zhangheng(赛事)
 * @Description:
 * @Date: 2018/7/27 17:33
 * @modified By:
 */
public class HttpClientUtil {

    private static Logger log = LoggerFactory.getLogger(HttpClientUtil.class);

    private static final String DEFAULTCHARSET = "UTF-8";

    private static String GOCD_AUTHER = "";

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
    private static final int MAX_TIMEOUT = 100000;

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

        try {
            GOCD_AUTHER = DatatypeConverter.printBase64Binary("gezhiwei:123456".getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    private HttpClientUtil() {

    }

    public static String doPostWithHttps(String apiUrl, String context) {
        return doPostWithHttps(apiUrl, context, null);
    }

    /**
     * @param apiUrl
     * @return
     */
    public static String getWithHttps(String apiUrl) {
        CloseableHttpClient httpClient = createClientSSLDefault();
        String httpStr = null;
        CloseableHttpResponse response = null;
        HttpGet httpGet = new HttpGet(apiUrl);
        try {
            httpGet.setConfig(requestConfig);
            httpGet.setHeader("Authorization", "Basic " + GOCD_AUTHER);
            httpGet.setHeader("Accept", "application/vnd.go.cd.v5+json");
            response = httpClient.execute(httpGet);
            HttpEntity entity = response.getEntity();
            httpStr = EntityUtils.toString(entity, "UTF-8");
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
     * @param apiUrl
     * @param context
     * @return
     */
    public static String doPostWithHttps(String apiUrl, String context, String contentType) {
        CloseableHttpClient httpClient = createClientSSLDefault();
        String httpStr = null;
        CloseableHttpResponse response = null;
        HttpPost httpPost = new HttpPost(apiUrl);
        try {
            httpPost.setConfig(requestConfig);
            String encoding = DatatypeConverter.printBase64Binary("gezhiwei:123456".getBytes(DEFAULTCHARSET));
            httpPost.setHeader("Authorization", "Basic " + encoding);
            StringEntity stringEntity = new StringEntity(context, Charset.forName(DEFAULTCHARSET));
            if (!StringUtils.isEmpty(contentType)) {
                //post传输是json格式数据
                stringEntity.setContentType(contentType);
            }
            httpPost.setEntity(stringEntity);
            response = httpClient.execute(httpPost);
            HttpEntity entity = response.getEntity();
            httpStr = EntityUtils.toString(entity, DEFAULTCHARSET);
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

    public static String doPostCertHttps(String apiUrl, String context, String charset, String contentType, File file) {
        CloseableHttpClient httpClient;
        String httpStr = null;
        CloseableHttpResponse response = null;
        HttpPost httpPost = new HttpPost(apiUrl);
        try {
            httpClient = ClientCustomSSL(file);
            httpPost.setConfig(requestConfig);
            StringEntity stringEntity = new StringEntity(context, Charset.forName(charset));
            if (!StringUtils.isEmpty(contentType)) {
                stringEntity.setContentType(contentType);//post传输是json格式数据
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
                    //logger.error("关闭HttpClientUtils.doPost()异常", e);
                }
            }
        }
        return httpStr;
    }

    /**
     * 方法描述：https请求数据，采用form形式表达数据传输
     * 作者：zhd37930
     *
     * @param apiUrl
     * @param params
     * @param charset
     * @param contentType
     * @return
     */
    public static String doPostWithHttps(String apiUrl, Map<String, Object> params, String charset, String contentType) {
        CloseableHttpClient httpClient = createClientSSLDefault();
        String httpStr = null;
        CloseableHttpResponse response = null;
        HttpPost httpPost = new HttpPost(apiUrl);
        try {
            httpPost.setConfig(requestConfig);
            if (params != null && params.size() > 0) {
                List<BasicNameValuePair> pairList = convertBasicPairList(params);//将map转化为BasicNameValuePair
                UrlEncodedFormEntity urlEncodedFormEntity = new UrlEncodedFormEntity(pairList, charset);
                if (contentType != null) {
                    urlEncodedFormEntity.setContentType(contentType);
                }
                httpPost.setEntity(urlEncodedFormEntity);
            }
            response = httpClient.execute(httpPost);
            HttpEntity entity = response.getEntity();
            httpStr = EntityUtils.toString(entity, charset);
        } catch (IOException e) {
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
    private static CloseableHttpClient ClientCustomSSL(File file) throws Exception {

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

    private static List<BasicNameValuePair> convertBasicPairList(Map<String, Object> map) {
        List<BasicNameValuePair> pairList = new ArrayList<BasicNameValuePair>();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            BasicNameValuePair pair = new BasicNameValuePair(entry.getKey(), entry.getValue().toString());
            pairList.add(pair);
        }
        return pairList;
    }

}
