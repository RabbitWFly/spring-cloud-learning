package com.rabbit.fsh.house.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author chentao
 * Date 2019/3/9
 * Description
 **/
@RestController
@RequestMapping("/house")
public class HouseController {

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }
}

