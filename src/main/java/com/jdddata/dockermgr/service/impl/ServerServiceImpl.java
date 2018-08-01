package com.jdddata.dockermgr.service.impl;

import com.jdddata.dockermgr.common.util.ResultGenerator;
import com.jdddata.dockermgr.common.vo.response.ResultVo;
import com.jdddata.dockermgr.dao.cmapper.ServerMgrCMapper;
import com.jdddata.dockermgr.dao.mapper.ServerMgrMapper;
import com.jdddata.dockermgr.northbound.dto.server.ServerInfoDto;
import com.jdddata.dockermgr.service.ServerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class ServerServiceImpl implements ServerService {

    @Autowired
    private ServerMgrMapper serverMgrMapper;

    @Autowired
    private ServerMgrCMapper serverMgrCMapper;

    @Override
    public ResultVo addServer(ServerInfoDto serverInfoDto) {
        if (Objects.isNull(serverInfoDto.getId())) {
            serverMgrMapper.insertSelective(serverInfoDto.convert());
        }
        serverMgrMapper.updateByPrimaryKey(serverInfoDto.convert());
        return ResultGenerator.getSuccess("success");
    }

    @Override
    public ResultVo list() {
        return ResultGenerator.getSuccessDto(serverMgrCMapper.listAll());
    }


}
