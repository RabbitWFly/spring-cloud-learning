package com.rabbit.auth.controller;

import com.rabbit.auth.po.User;
import com.rabbit.auth.query.AuthQuery;
import com.rabbit.auth.service.AuthService;
import com.rabbit.common.base.ResponseData;
import com.rabbit.common.util.JWTUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author chentao
 * Date 2019/4/1
 * Description
 **/
@RestController
@RequestMapping(value = "/oauth")
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/token")
    public ResponseData auth(@RequestBody AuthQuery query){
        if(StringUtils.isEmpty(query.getAccessKey()) || StringUtils.isEmpty(query.getSecretKey())){
            return ResponseData.failByParam("accessKey and secretKey not null");
        }

        User user = authService.auth(query);
        if(null == user){
            return ResponseData.failByParam("认证失败");
        }
        JWTUtils jwtUtils = JWTUtils.getInstance();
        return ResponseData.ok(jwtUtils.getToken(user.getId().toString()));
    }

    @GetMapping("/token")
    public ResponseData oauth(AuthQuery query) throws Exception{
        if(StringUtils.isEmpty(query.getAccessKey()) || StringUtils.isEmpty(query.getSecretKey())){
            return ResponseData.failByParam("accessKey and secretKey not null");
        }

        User user = authService.auth(query);
        if(null == user){
            return ResponseData.failByParam("认证失败");
        }
        JWTUtils jwtUtils = JWTUtils.getInstance();
        return ResponseData.ok(jwtUtils.getToken(user.getId().toString()));
    }


}

