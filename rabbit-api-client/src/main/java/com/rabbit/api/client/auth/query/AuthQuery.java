package com.rabbit.api.client.auth.query;

/**
 * @Author chentao
 * Date 2019/4/1
 * Description api 用户认证参数类
 **/
public class AuthQuery {
    private String accessKey;

    private String secretKey;

    public String getAccessKey() {
        return accessKey;
    }

    public void setAccessKey(String accessKey) {
        this.accessKey = accessKey;
    }

    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }
}

