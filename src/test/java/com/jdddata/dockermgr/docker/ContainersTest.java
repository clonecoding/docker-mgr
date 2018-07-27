package com.jdddata.dockermgr.docker;

import com.alibaba.fastjson.JSON;
import com.jdddata.dockermgr.adapter.docker.httpadapter.HttpClientUtils;
import com.jdddata.dockermgr.adapter.docker.httpadapter.HttpResponse;
import com.jdddata.dockermgr.adapter.docker.httpadapter.container.create.ContainerCreateDto;
import com.jdddata.dockermgr.adapter.docker.httpadapter.container.create.HostConfig;
import com.jdddata.dockermgr.adapter.docker.httpadapter.container.list.ContainerListDto;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ContainersTest {

    @Test
    public void deleteContainer() {
        HttpResponse httpResponse = HttpClientUtils.deleteWithCert("https://10.33.94.5:2376/containers/gezhiwei");
        System.out.println(httpResponse.getStatusCode());
        System.out.println(httpResponse.getBody());
    }

    @Test
    public void stopContainer() {
        HttpResponse httpResponse = HttpClientUtils.postWithCert("https://10.33.94.5:2376/containers/gezhiwei/stop", null);
        System.out.println(httpResponse.getStatusCode());
        System.out.println(httpResponse.getBody());
    }

    @Test
    public void startContainer() {
        HttpResponse httpResponse = HttpClientUtils.postWithCert("https://10.33.94.5:2376/containers/gezhiwei/start", null);
        System.out.println(httpResponse.getStatusCode());
        System.out.println(httpResponse.getBody());

    }


    @Test
    public void fetchContainerInfo() {
        HttpResponse response = HttpClientUtils.getWithCert("https://10.33.94.5:2376/containers/json?all=true");
        System.out.println(response.getStatusCode());
        System.out.println(response.getBody());
        String body = response.getBody();
        List<ContainerListDto> obj = JSON.parseArray(body, ContainerListDto.class);
        System.out.println("asdfasf");
    }


    @Test
    public void stats() {
        Map<String, Object> params = new HashMap<>(16);
        params.put("stream", false);
        HttpResponse httpResponse = HttpClientUtils.getWithCert("https://10.33.94.34:2376/containers/webdav/stats", params);
        System.out.println(httpResponse.getBody());
    }


    @Test
    public void getContainerLogs() {
        Map<String, Object> params = new HashMap<>(16);
        params.put("follow", true);
        params.put("stdout", true);
        HttpResponse response = HttpClientUtils.getWithCert("https://10.33.94.5:2376/containers/dac-download-core/logs", params);
        System.out.println(response.getStatusCode());
        System.out.println(response.getBody());
        String body = response.getBody();
        List<ContainerListDto> obj = JSON.parseArray(body, ContainerListDto.class);
        System.out.println("asdfasf");
    }

    @Test
    public void createContainer() {
        ContainerCreateDto containerCreateDto = new ContainerCreateDto();
//        containerCreateDto.setHostname();
//        containerCreateDto.setDomainname();
//        containerCreateDto.setUser();
//        containerCreateDto.setAttachStdin();
//        containerCreateDto.setAttachStdout();
//        containerCreateDto.setAttachStderr();
//        containerCreateDto.setTty();
//        containerCreateDto.setOpenStdin();
//        containerCreateDto.setStdinOnce();
//        containerCreateDto.setEnv();
//        containerCreateDto.setCmd();
//        containerCreateDto.setEntrypoint();
        containerCreateDto.setImage("nginx");
//        containerCreateDto.setLabels();
//        containerCreateDto.setVolumes("");
//        containerCreateDto.setWorkingDir();
//        containerCreateDto.setNetworkDisabled();
//        containerCreateDto.setMacAddress();
//        containerCreateDto.setExposedPorts();
//        containerCreateDto.setStopSignal();
//        containerCreateDto.setStopTimeout();

        containerCreateDto.setHostConfig(createHostConfig());
//        containerCreateDto.setNetworkingConfig();
//        containerCreateDto.setAdditionalProperties();

        String jsonString = JSON.toJSONString(containerCreateDto);
        HttpResponse httpResponse = HttpClientUtils.postRawWithCert("https://10.33.94.5:2376/containers/create?name=gezhiwei", jsonString);
        System.out.println(httpResponse.getStatusCode());
        System.out.println(httpResponse.getBody());
    }

    private HostConfig createHostConfig() {
        HostConfig hostConfig = new HostConfig();
        List<String> value = Arrays.asList("/root/gezhiwei/:/opt/gezhiwei/");
        hostConfig.setBinds(value);
//        hostConfig.setLinks();
//        hostConfig.setMemory();
//        hostConfig.setMemorySwap();
//        hostConfig.setMemoryReservation();
//        hostConfig.setKernelMemory();
//        hostConfig.setNanoCPUs();
//        hostConfig.setCpuPercent();
//        hostConfig.setCpuShares();
//        hostConfig.setCpuPeriod();
//        hostConfig.setCpuRealtimePeriod();
//        hostConfig.setCpuRealtimeRuntime();
//        hostConfig.setCpuQuota();
//        hostConfig.setCpusetCpus();
//        hostConfig.setCpusetMems();
//        hostConfig.setMaximumIOps();
//        hostConfig.setMaximumIOBps();
//        hostConfig.setBlkioWeight();
//        hostConfig.setMemorySwappiness();
//        hostConfig.setOomKillDisable();
//        hostConfig.setOomScoreAdj();
//        hostConfig.setPidMode();
//        hostConfig.setPidsLimit();
//        hostConfig.setPortBindings();
//        hostConfig.setPublishAllPorts();
//        hostConfig.setPrivileged();
//        hostConfig.setReadonlyRootfs();
//        hostConfig.setDns();
//        hostConfig.setDnsOptions();
//        hostConfig.setDnsSearch();
//        hostConfig.setVolumesFrom();
//        hostConfig.setCapAdd();
//        hostConfig.setCapDrop();
//        hostConfig.setGroupAdd();
//        hostConfig.setRestartPolicy();
//        hostConfig.setAutoRemove();
//        hostConfig.setNetworkMode();
//        hostConfig.setDevices();
//        hostConfig.setLogConfig();
//        hostConfig.setSecurityOpt();
//        hostConfig.setShmSize();
        return hostConfig;
    }
}
