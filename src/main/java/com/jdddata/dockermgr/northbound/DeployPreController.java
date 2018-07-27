package com.jdddata.dockermgr.northbound;

import com.jdddata.dockermgr.common.exception.ValidatorException;
import com.jdddata.dockermgr.common.util.DigitUtil;
import com.jdddata.dockermgr.common.util.ExceptionUtil;
import com.jdddata.dockermgr.common.vo.ResultVo;
import com.jdddata.dockermgr.northbound.dto.deploy.DeployInfoDto;
import com.jdddata.dockermgr.northbound.dto.git.GitDto;
import com.jdddata.dockermgr.service.DeployService;
import com.jdddata.dockermgr.service.PomParseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/deploy")
public class DeployPreController {

    private static final String CONTAINER_NAME_REX = "^[a-zA-Z][a-zA-Z0-9-_]{3,25}$";
    private static final String CPUS_REX_1 = "^[0-9]$";
    private static final String CPUS_REX_2 = "^[0-9][-][1-9]{0,3}$";
    @Autowired
    private DeployService deployService;

    @Autowired
    private PomParseService pomParseService;

    /**
     * 获取版本分支信息
     *
     * @param projectId
     * @return
     */
    @GetMapping("/{projectId}/info")
    public ResultVo info(@PathVariable String projectId) {

        return deployService.fetchPreInfo(projectId);
    }

    @PostMapping("/nexus")
    public ResultVo nexus(@RequestBody GitDto gitDto) {
        return pomParseService.parseFromGit(gitDto);
    }

    @PostMapping("/saveOrUpdate")
    public ResultVo create(@RequestBody DeployInfoDto deployInfoDto) {
        try {
            checkDto(deployInfoDto);
            return deployService.saveOrUpdate(deployInfoDto);
        } catch (ValidatorException e) {
            return ExceptionUtil.getFail(e);
        }
    }


    @PostMapping("/clone")
    public ResultVo clone(@RequestBody DeployInfoDto deployInfoDto) {
        return deployService.clone(deployInfoDto);
    }

    @DeleteMapping("/delete/{id}")
    public ResultVo delete(@PathVariable("id") String id) {
        return deployService.delete(id);
    }

    private void checkDto(DeployInfoDto deployInfoDto) throws ValidatorException {
        if (!deployInfoDto.getDockerContainerName().matches(CONTAINER_NAME_REX)) {
            throw new ValidatorException("docker容器名称不允许特殊字符 长度在4-25个字符之间");
        }

        /**
         * 这里最好结合server的info来看
         */
        if (null != deployInfoDto.getDockerCpusetCpus() && !(deployInfoDto.getDockerCpusetCpus().matches(CPUS_REX_1) || deployInfoDto.getDockerCpusetCpus().matches(CPUS_REX_2))) {
            throw new ValidatorException("docker指定cpu运行参数不合法");
        }
        if (deployInfoDto.getDockerCpusetCpus().matches(CPUS_REX_2)) {
            String[] split = deployInfoDto.getDockerCpusetCpus().split("-");
            if (Integer.parseInt(split[0]) > Integer.parseInt(split[1])) {
                throw new ValidatorException("docker指定cpu运行参数不合法");
            }
        }

        if (!DigitUtil.isDigit(deployInfoDto.getDockerMemory())) {
            throw new ValidatorException("docker指定内存运行参数不合法");
        }
    }
}
