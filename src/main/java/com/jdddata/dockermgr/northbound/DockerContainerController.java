package com.jdddata.dockermgr.northbound;

import com.jdddata.dockermgr.northbound.dto.container.ContainerCreatePyDto;
import com.jdddata.dockermgr.service.DockerContainerService;
import com.jdddata.dockermgr.common.vo.response.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/docker/container")
public class DockerContainerController {



    @Autowired
    private DockerContainerService dockerContainerService;

    @PostMapping("/{serverInfo}/{name}/create")
    public ResultVo createContainer(@RequestBody ContainerCreatePyDto containerCreatePyDto, @PathVariable("serverInfo") String serverInfo, @PathVariable("name") String name) {
        return dockerContainerService.createContainer(serverInfo, name, containerCreatePyDto);
    }

    @GetMapping("/{serverInfo}/{name}/start")
    public ResultVo startContainer(@PathVariable("serverInfo") String serverInfo, @PathVariable("name") String name) {
        return dockerContainerService.startContainer(serverInfo, name);
    }

    @GetMapping("/{serverInfo}/{name}/restart")
    public ResultVo restartContainer(@PathVariable("serverInfo") String serverInfo, @PathVariable("name") String name) {
        return dockerContainerService.restartContainer(serverInfo, name);
    }

    @GetMapping("/{serverInfo}/{name}/stop")
    public ResultVo stopContainer(@PathVariable("serverInfo") String serverInfo, @PathVariable("name") String name) {
        return dockerContainerService.stopContainer(serverInfo, name);
    }

    @GetMapping("/{serverInfo}/{name}/logs")
    public ResultVo getLogs(@PathVariable("serverInfo") String serverInfo, @PathVariable("name") String name) {
        return dockerContainerService.getContainerLogs(serverInfo, name);
    }

    @DeleteMapping("/{serverInfo}/{name}/delete")
    public ResultVo deleteContainer(@PathVariable("serverInfo") String serverInfo, @PathVariable("name") String name) {
        return dockerContainerService.deleteContainer(serverInfo, name);
    }

    @GetMapping("/{serverInfo}/{name}/get")
    public ResultVo getContainerByName(@PathVariable("serverInfo") String serverInfo, @PathVariable("name") String name) {
        return dockerContainerService.getSpecContainer(serverInfo, name);
    }
//    @PostMapping("/list")
//    public ResultVo listContainer(@RequestBody String containerCreatePyDto) {
//        return dockerContainerService.listContainer(containerCreatePyDto);
//    }
}