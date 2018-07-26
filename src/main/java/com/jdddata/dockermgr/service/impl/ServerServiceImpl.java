package com.jdddata.dockermgr.service.impl;

import com.jdddata.dockermgr.common.vo.ResultGenerator;
import com.jdddata.dockermgr.common.vo.ResultVo;
import com.jdddata.dockermgr.dao.mapper.ServerMgrMapper;
import com.jdddata.dockermgr.dao.modle.ServerMgr;
import com.jdddata.dockermgr.northbound.dto.ServerInfoDto;
import com.jdddata.dockermgr.service.ServerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServerServiceImpl implements ServerService {

    @Autowired
    private ServerMgrMapper serverMgrMapper;

    @Override
    public ResultVo addServer(ServerInfoDto serverInfoDto) {
        serverMgrMapper.insertServerMgr(serverInfoDto.convert());
        return ResultGenerator.getSuccess("success");
    }

    @Override
    public ResultVo list() {
        return ResultGenerator.getSuccess(serverMgrMapper.queryServerMgr(new ServerMgr()));
    }
}
