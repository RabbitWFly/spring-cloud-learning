package com.rabbit.common.exception;

import com.rabbit.common.base.ResponseCode;

/**
 * @Author chentao
 * Date 2019/3/27
 * Description
 **/
public class LimitException extends GlobalException {
    private static final long serialVersionUID = 4066485840242028945L;

    public LimitException(String message) {
        super(message, ResponseCode.LIMIT_ERROR_CODE.getCode());
    }
}

