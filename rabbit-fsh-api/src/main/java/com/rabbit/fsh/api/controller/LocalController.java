package com.rabbit.fsh.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author chentao
 * Date 2019/3/26
 * Description
 **/
@RestController
public class LocalController {
    @GetMapping("/local/{id}")
    public String local(@PathVariable String id){
        return id;
    }
}

