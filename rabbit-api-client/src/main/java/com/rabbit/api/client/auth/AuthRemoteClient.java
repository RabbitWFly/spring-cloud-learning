package com.rabbit.api.client.auth;

import com.rabbit.api.client.auth.query.AuthQuery;
import com.rabbit.api.client.config.FeignConfiguration;
import com.rabbit.common.base.ResponseData;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @Author chentao
 * Date 2019/4/6
 * Description 认证服务API调用客户端
 **/
@FeignClient(value =  "rabbit-auth-service", path="/oauth", configuration = FeignConfiguration.class, fallback = AuthRemoteClientHystrix.class)
public interface AuthRemoteClient {

    @PostMapping("/token")
    ResponseData auth(@RequestBody AuthQuery query);
}

