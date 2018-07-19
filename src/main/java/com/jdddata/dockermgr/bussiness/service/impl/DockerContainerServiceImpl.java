package com.jdddata.dockermgr.bussiness.service.impl;

import com.jdddata.dockermgr.bussiness.controller.dto.container.ContainerCreatePyDto;
import com.jdddata.dockermgr.bussiness.service.DockerContainerService;
import com.jdddata.dockermgr.bussiness.service.bo.container.create.ContainerCreateDto;
import com.jdddata.dockermgr.bussiness.service.bo.container.create.HostConfig;
import com.jdddata.dockermgr.common.DockerClient;
import com.jdddata.dockermgr.vo.ResultGenerator;
import com.jdddata.dockermgr.vo.ResultVo;
import org.apache.commons.lang3.StringUtils;
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
    @Override
    public ResultVo createContainer(String serverInfo, String name, ContainerCreatePyDto containerCreatePyDto) {

        if (DockerClient.containerNameExist("", name)) {

            return ResultGenerator.getFail("容器命名已经存在，请更换");
        }
        // 判断image在当前节点是否存在
        if (!DockerClient.imageNameOrIdExist("", name)) {
            String image = containerCreatePyDto.getImage();
            String[] split = image.split(":");
            DockerClient.createImage(split[0], split[1], "");
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
        containerCreateDto.setEntrypoint(containerCreatePyDto.getEntryPoint());
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
