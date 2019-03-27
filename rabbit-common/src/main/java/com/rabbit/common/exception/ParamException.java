package com.rabbit.common.exception;

import com.rabbit.common.base.ResponseCode;

/**
 * @Author chentao
 * Date 2019/3/27
 * Description
 **/
public class ParamException extends GlobalException {
    private static final long serialVersionUID = 6021390821349937519L;

    public ParamException(String message) {
        super(message, ResponseCode.PARAM_ERROR_CODE.getCode());
    }
}

