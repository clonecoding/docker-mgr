package com.jdddata.dockermgr.service.impl;

import com.jdddata.dockermgr.northbound.dto.container.ContainerCreatePyDto;
import com.jdddata.dockermgr.service.DockerContainerService;
import com.jdddata.dockermgr.adapter.docker.httpadapter.container.create.ContainerCreateDto;
import com.jdddata.dockermgr.adapter.docker.httpadapter.container.create.HostConfig;
import com.jdddata.dockermgr.adapter.docker.DockerClient;
import com.jdddata.dockermgr.common.util.ResultGenerator;
import com.jdddata.dockermgr.common.vo.response.ResultVo;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * @Author: zhangheng(赛事)
 * @Description:
 * @Date: 2018/7/17 15:26
 * @modified By:
 */
@Service
public class DockerContainerServiceImpl implements DockerContainerService {

    private static final Logger LOG = LoggerFactory.getLogger(DockerContainerServiceImpl.class);

    @Override
    public ResultVo createContainer(String serverInfo, String name, ContainerCreatePyDto containerCreatePyDto) {
        /*判断当前镜像名是否存在，不存在-> 创建镜像 */
        if (!DockerClient.imageNameOrIdExist(serverInfo, name)) {
            String image = containerCreatePyDto.getImage();
            String[] split = image.split(":");
            DockerClient.createImage(split[0], split[1], serverInfo);
        }
        ContainerCreateDto containerCreateDto = getContainerCreateDto(containerCreatePyDto);
        return ResultGenerator.getByDockerResponse(DockerClient.createContainer(serverInfo, name, containerCreateDto));
    }

    @Override
    public ResultVo listContainer(String serverInfo) {
        return null;
    }

    @Override
    public ResultVo startContainer(String serverInfo, String name) {
        return ResultGenerator.getByDockerResponse(DockerClient.startContainer(serverInfo, name));
    }

    @Override
    public ResultVo restartContainer(String serverInfo, String name) {
        return ResultGenerator.getByDockerResponse(DockerClient.restartContainer(serverInfo, name));
    }

    @Override
    public ResultVo stopContainer(String serverInfo, String name) {
        return ResultGenerator.getByDockerResponse(DockerClient.stopContainer(serverInfo, name));
    }

    @Override
    public ResultVo deleteContainer(String serverInfo, String name) {
        return ResultGenerator.getByDockerResponse(DockerClient.deleteContainer(serverInfo, name));
    }

    @Override
    public ResultVo getSpecContainer(String serverInfo, String name) {
        return ResultGenerator.getByDockerResponse(DockerClient.getSpecContainer(serverInfo, name));
    }

    @Override
    public ResultVo getContainerLogs(String serverInfo, String name) {
        Map<String, Object> params = new HashMap<>(16);
        params.put("follow", true);
        params.put("stdout", true);
        return ResultGenerator.getByDockerResponse(DockerClient.getContainerLogs(serverInfo, name, params));
    }

    private ContainerCreateDto getContainerCreateDto(ContainerCreatePyDto containerCreatePyDto) {
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
        if (StringUtils.isNotBlank(containerCreatePyDto.getEnv())) {
            setterEnv(containerCreateDto, containerCreatePyDto.getEnv());
        }
        if (StringUtils.isNotBlank(containerCreatePyDto.getCmd())) {
            setterCmd(containerCreateDto, containerCreatePyDto.getCmd());
        }
        if (StringUtils.isNotBlank(containerCreatePyDto.getEntryPoint())) {
            setterEntrypoint(containerCreateDto, containerCreatePyDto.getEntryPoint());
        }
        containerCreateDto.setImage(containerCreatePyDto.getImage().trim());
//        containerCreateDto.setLabels();
//        containerCreateDto.setVolumes();
//        containerCreateDto.setWorkingDir();
//        containerCreateDto.setNetworkDisabled();
//        containerCreateDto.setMacAddress();
        if (StringUtils.isNotBlank(containerCreatePyDto.getPorts())) {
            setterExposedPorts(containerCreateDto, containerCreatePyDto.getPorts());
        }
//        containerCreateDto.setStopSignal();
//        containerCreateDto.setStopTimeout();

//        containerCreateDto.setHostConfig();
        setterHostConfig(containerCreateDto, containerCreatePyDto);
//        containerCreateDto.setNetworkingConfig();
//        containerCreateDto.setAdditionalProperties();
        return containerCreateDto;
    }

    private void setterEntrypoint(ContainerCreateDto containerCreateDto, String entryPoint) {
        containerCreateDto.setEntrypoint(Arrays.asList(entryPoint.split(",")));
    }

    private void setterHostConfig(ContainerCreateDto containerCreateDto, ContainerCreatePyDto containerCreatePyDto) {
        HostConfig hostConfig = new HostConfig();

//        hostConfig.setPortBindings(value);

        String ports = containerCreatePyDto.getPorts();
        String volumes = containerCreatePyDto.getVolumes();

        if (StringUtils.isNotBlank(ports)) {
            Map<String, List<Map<String, String>>> value = new HashMap<>();
            for (String portPair : ports.split(",")) {
                String host = portPair.split(":")[0];
                String container = portPair.split(":")[1];
                Map<String, String> map = new HashMap<>();
                map.put("HostPort", container);
                value.put(host + "/tcp", Arrays.asList(map));
            }
            hostConfig.setPortBindings(value);
        }

        if (StringUtils.isNotBlank(volumes)) {
            List<String> value = Arrays.asList(volumes);
            hostConfig.setBinds(value);
        }

        hostConfig.setMemory(containerCreatePyDto.getMemory());
        hostConfig.setMemorySwap(containerCreatePyDto.getMemorySwap());
        hostConfig.setMemoryReservation(containerCreatePyDto.getMemoryReservation());
        hostConfig.setCpusetCpus(containerCreatePyDto.getCpusetCpus());
        containerCreateDto.setHostConfig(hostConfig);
    }

    private void setterExposedPorts(ContainerCreateDto containerCreateDto, String ports) {
        Map<String, Object> value = new HashMap<>();
        for (String portPair : ports.split(",")) {
            value.put(portPair.split(":")[1] + "/tcp", new Object());
        }
        containerCreateDto.setExposedPorts(value);
    }

    private void setterCmd(ContainerCreateDto containerCreateDto, String cmd) {
        List<String> cmds = new ArrayList<>();
        for (String c : cmd.split(",")) {
            cmds.add(c);
        }
        containerCreateDto.setEnv(cmds);
    }

    private void setterEnv(ContainerCreateDto containerCreateDto, String env) {
        List<String> envs = new ArrayList<>();
        for (String e : env.split(",")) {
            envs.add(e);
        }
        containerCreateDto.setEnv(envs);
    }
}
