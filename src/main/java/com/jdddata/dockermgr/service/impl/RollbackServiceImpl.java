package com.jdddata.dockermgr.service.impl;

import com.jdddata.dockermgr.adapter.docker.DockerClient;
import com.jdddata.dockermgr.common.util.ResultGenerator;
import com.jdddata.dockermgr.common.util.ThreadPoolUtils;
import com.jdddata.dockermgr.common.vo.response.ResultVo;
import com.jdddata.dockermgr.dao.cmapper.ProjectDeployInfoCMapper;
import com.jdddata.dockermgr.northbound.dto.container.ContainerCreatePyDto;
import com.jdddata.dockermgr.northbound.dto.deploy.DeployInfoDetailDto;
import com.jdddata.dockermgr.northbound.dto.deploy.DeployInfoDto;
import com.jdddata.dockermgr.service.DockerContainerService;
import com.jdddata.dockermgr.service.RollbackService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;

/**
 * @Author: zhangheng(赛事)
 * @Description:
 * @Date: 2018/8/9 15:26
 * @modified By:
 */
public class RollbackServiceImpl implements RollbackService {

    @Autowired
    ProjectDeployInfoCMapper projectDeployInfoCMapper;
    @Autowired
    DockerContainerService dockerContainerService;

    /**
     * @return
     * @author zhangheng(赛事)
     * @description docker 回滚操作
     */
    @Override
    public ResultVo dockerRollback(Long projectDeployId, String branch) {
        List<DeployInfoDto> deployInfoDtos = projectDeployInfoCMapper.findByDeployId(projectDeployId);
        List<DeployInfoDetailDto> deployInfoDetailDtos = new ArrayList<>();
        if (Objects.nonNull(deployInfoDtos) && deployInfoDtos.size() == 1) {
            deployInfoDtos.get(0).getArtifactDtoList().forEach(item -> {
                item.getDeployInfoDetailDtoList().forEach(item2 -> {
                    deployInfoDetailDtos.add(item2);
                });
            });
        } else {
            return ResultGenerator.getFail("查询项目部署信息异常");
        }
        String tag = (deployInfoDtos.get(0).getDeployEnv() == 0) ? "test" : "prod" + branch;
        CountDownLatch countDownLatch = new CountDownLatch(deployInfoDetailDtos.size());
        for (DeployInfoDetailDto deployInfoDetailDto : deployInfoDetailDtos) {
            ThreadPoolUtils.getThreadPool().execute(new SubRollback(tag,deployInfoDetailDto,countDownLatch));
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return ResultGenerator.getSuccess();
    }

    /**
     * @param projectDeployId
     * @param branch
     * @return
     * @author zhangheng(赛事)
     * @description 常规部署项目进行回滚操作
     */
    @Override
    public ResultVo commomRollback(Long projectDeployId, String branch) {
        return null;
    }

    private class SubRollback implements Runnable {

        private String tag;

        private DeployInfoDetailDto deployInfoDetailDto;

        private CountDownLatch countDownLatch;

        public SubRollback() {
        }

        public SubRollback(String tag, DeployInfoDetailDto deployInfoDetailDto, CountDownLatch countDownLatch) {
            this.tag = tag;
            this.deployInfoDetailDto = deployInfoDetailDto;
            this.countDownLatch = countDownLatch;
        }

        public DeployInfoDetailDto getDeployInfoDetailDto() {
            return deployInfoDetailDto;
        }

        public void setDeployInfoDetailDto(DeployInfoDetailDto deployInfoDetailDto) {
            this.deployInfoDetailDto = deployInfoDetailDto;
        }

        public CountDownLatch getCountDownLatch() {
            return countDownLatch;
        }

        public void setCountDownLatch(CountDownLatch countDownLatch) {
            this.countDownLatch = countDownLatch;
        }

        public String getTag() {
            return tag;
        }

        public void setTag(String tag) {
            this.tag = tag;
        }
        @Override
        public void run() {
            String ip = deployInfoDetailDto.getHostIp();
            String imageName = deployInfoDetailDto.getDockerImageName();
            /*停止并删除容器*/
            DockerClient.stopContainer(ip, deployInfoDetailDto.getDockerContainerName());
            DockerClient.deleteContainer(ip, deployInfoDetailDto.getDockerContainerName());
            /*创建容器*/
            dockerContainerService.createContainer(ip, imageName + ":" + tag, getCreatePyDto(deployInfoDetailDto));
            countDownLatch.countDown();
        }

        private ContainerCreatePyDto getCreatePyDto(DeployInfoDetailDto deployInfoDetailDto) {
            ContainerCreatePyDto containerCreatePyDto = new ContainerCreatePyDto();
            containerCreatePyDto.setImage(deployInfoDetailDto.getDockerImageName());
            containerCreatePyDto.setVolumes(deployInfoDetailDto.getDockerMount());
            containerCreatePyDto.setEntryPoint(deployInfoDetailDto.getDockerEntrypoint());
            containerCreatePyDto.setEnv(deployInfoDetailDto.getDockerEnv());
            //containerCreatePyDto.setHostConfig(deployInfoDetailDto.getHostIp());
            containerCreatePyDto.setMemory(Integer.valueOf(deployInfoDetailDto.getDockerMemory()));
            containerCreatePyDto.setMemorySwap(Integer.valueOf(deployInfoDetailDto.getDockerMemorySwappiness()));
            containerCreatePyDto.setMemoryReservation(Integer.valueOf(deployInfoDetailDto.getDockerMemoryReservation()));
            containerCreatePyDto.setCpusetCpus(deployInfoDetailDto.getDockerCpusetCpus());
            return containerCreatePyDto;
        }
    }

}
