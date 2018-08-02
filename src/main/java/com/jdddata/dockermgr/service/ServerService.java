package com.jdddata.dockermgr.service;

import com.jdddata.dockermgr.common.vo.response.ResultVo;
import com.jdddata.dockermgr.northbound.dto.server.ServerInfoDto;

public interface ServerService {
    ResultVo addServer(ServerInfoDto serverInfoDto);

    ResultVo list();

    ResultVo deleteById(Long id);
}
