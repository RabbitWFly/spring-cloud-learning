package com.rabbit.fsh.substitution.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author chentao
 * Date 2019/3/9
 * Description
 **/
@RestController
@RequestMapping("/substitution")
public class SubstitutionController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/callHello")
    public String callHello(){
        return restTemplate.getForObject("http://fsh-house/house/hello", String.class);
    }
}

