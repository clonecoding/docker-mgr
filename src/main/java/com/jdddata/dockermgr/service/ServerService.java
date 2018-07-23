package com.jdddata.dockermgr.service;

import com.jdddata.dockermgr.common.vo.ResultVo;
import com.jdddata.dockermgr.northbound.dto.ServerInfoDto;

public interface ServerService {
    ResultVo addServer(ServerInfoDto serverInfoDto);
}
