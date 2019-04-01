package com.rabbit.auth.service;

import com.rabbit.auth.po.User;
import com.rabbit.auth.query.AuthQuery;
import org.springframework.stereotype.Service;

/**
 * @Author chentao
 * Date 2019/4/1
 * Description
 **/
@Service
public class AuthServiceImpl implements AuthService {

    @Override
    public User auth(AuthQuery query) {
        return new User(1L);
    }
}

