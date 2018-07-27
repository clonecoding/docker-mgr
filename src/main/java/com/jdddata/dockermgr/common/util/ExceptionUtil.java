package com.jdddata.dockermgr.common.util;

import com.jdddata.dockermgr.common.exception.ValidatorException;
import com.jdddata.dockermgr.common.vo.ResultGenerator;
import com.jdddata.dockermgr.common.vo.ResultVo;

public final class ExceptionUtil {
    public static ResultVo getFail(ValidatorException e) {
        return ResultGenerator.getFail(e.getMessage());
    }
}
