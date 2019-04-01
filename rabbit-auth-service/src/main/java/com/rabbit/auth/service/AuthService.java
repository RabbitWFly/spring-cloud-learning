package com.rabbit.auth.service;

import com.rabbit.auth.po.User;
import com.rabbit.auth.query.AuthQuery;

public interface AuthService {

    User auth(AuthQuery query);
}
