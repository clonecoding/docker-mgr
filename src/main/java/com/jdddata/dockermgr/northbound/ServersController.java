package com.jdddata.dockermgr.northbound;

import com.jdddata.dockermgr.common.vo.ResultVo;
import com.jdddata.dockermgr.northbound.dto.ServerInfoDto;
import com.jdddata.dockermgr.service.ServerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 对服务器信息的管理
 */
@RestController
@RequestMapping("/server")
public class ServersController {

    @Autowired
    private ServerService serverService;

    @PostMapping("/add")
    public ResultVo addServer(@RequestBody ServerInfoDto serverInfoDto) {
        return serverService.addServer(serverInfoDto);
    }

}
