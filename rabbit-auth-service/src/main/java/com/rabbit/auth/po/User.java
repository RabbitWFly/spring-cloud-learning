package com.rabbit.auth.po;

/**
 * @Author chentao
 * Date 2019/4/1
 * Description
 **/
public class User {
    private Long id;

    public User(Long id) {
        this.id = id;
    }
    public User() {
    }
    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}

