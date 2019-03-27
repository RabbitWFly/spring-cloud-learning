package com.rabbit.common.exception;

import com.rabbit.common.base.ResponseCode;

/**
 * @Author chentao
 * Date 2019/3/27
 * Description
 **/
public class ServerException extends GlobalException {

    private static final long serialVersionUID = -1355046108056594333L;

    public ServerException(String message) {
        super(message, ResponseCode.SERVER_ERROR_CODE.getCode());
    }
}

