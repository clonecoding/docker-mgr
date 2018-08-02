package com.jdddata.dockermgr.service.impl;

import com.jdddata.dockermgr.common.util.ResultGenerator;
import com.jdddata.dockermgr.common.vo.response.ResultVo;
import com.jdddata.dockermgr.dao.cmapper.ServerMgrCMapper;
import com.jdddata.dockermgr.dao.entity.ServerMgr;
import com.jdddata.dockermgr.dao.mapper.ServerMgrMapper;
import com.jdddata.dockermgr.northbound.dto.server.ServerInfoDto;
import com.jdddata.dockermgr.service.ServerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
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
        List<ServerInfoDto> serverInfoDtos =new ArrayList<>();
        List<ServerMgr> serverMgrs = serverMgrCMapper.listAll();
        if(Objects.nonNull(serverInfoDtos)) {
            serverMgrs.forEach(item -> {
                serverInfoDtos.add(new ServerInfoDto(item));
            });
        }
        return ResultGenerator.getSuccessDto(serverInfoDtos);
    }

    @Override
    public ResultVo deleteById(Long id) {
        serverMgrMapper.deleteByPrimaryKey(id);
        return ResultGenerator.getSuccess();
    }

}
