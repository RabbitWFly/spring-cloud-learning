package com.rabbit.fsh.house.controller;

import com.rabbit.fsh.house.po.HouseInfo;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/data")
    public HouseInfo getData(@RequestParam("name") String name){
        return new HouseInfo(1L, "上海", "虹口", "东体小区");
    }

    @GetMapping("/data/{name}")
    public String getData2(@PathVariable("name") String name){
        return name;
    }

    @PostMapping("/save")
    public Long addData(@RequestBody HouseInfo houseInfo){
        System.out.println(houseInfo.getName());
        return 1001L;
    }
}

