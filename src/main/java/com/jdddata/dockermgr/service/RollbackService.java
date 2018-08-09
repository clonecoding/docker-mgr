package com.jdddata.dockermgr.service;

import com.jdddata.dockermgr.common.vo.response.ResultVo;

/**
 * @Author: zhangheng(赛事)
 * @Description:
 * @Date: 2018/8/9 15:26
 * @modified By:
 */
public interface RollbackService {

    /**
     * @return
     * @author zhangheng(赛事)
     * @description docker 回滚操作
     */
    ResultVo dockerRollback(Long projectDeployId, String branch);

    /**
     * @author zhangheng(赛事)
     * @description 常规部署项目进行回滚操作
     * @param projectDeployId
     * @param branch
     * @return
     */
    ResultVo commomRollback(Long projectDeployId, String branch);
}
