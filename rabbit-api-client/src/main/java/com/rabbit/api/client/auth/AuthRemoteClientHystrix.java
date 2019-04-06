package com.rabbit.api.client.auth;

import com.rabbit.api.client.auth.query.AuthQuery;
import com.rabbit.common.base.ResponseData;
import org.springframework.stereotype.Component;

/**
 * @Author chentao
 * Date 2019/4/6
 * Description
 **/
@Component
public class AuthRemoteClientHystrix implements AuthRemoteClient {

    @Override
    public ResponseData auth(AuthQuery query) {
        return ResponseData.ok("");
    }
}

