package com.rabbit.fsh.substitution.controller;

import com.rabbit.fsh.substitution.dto.HouseInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
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

    @GetMapping("/data")
    public HouseInfo getData(@RequestParam("name") String name){
        ResponseEntity<HouseInfo> responseEntity = restTemplate.getForEntity("http://fsh-house/house/data?name="+name,HouseInfo.class);
        if(responseEntity.getStatusCodeValue() == 200){
            return responseEntity.getBody();
        }
        return null;
        //return restTemplate.getForObject("http://localhost:8081/house/data?name="+name, HouseInfo.class);
    }

    @GetMapping("/data/{name}")
    public String getData2(@PathVariable("name") String name){
        return restTemplate.getForObject("http://fsh-house/house/data/{name}", String.class, name);
    }

    /**没有调通*/
    @GetMapping("/save")
    public Long add(){
        HouseInfo houseInfo = new HouseInfo();
        houseInfo.setCity("北京");
        houseInfo.setRegion("海淀区");
        houseInfo.setName("你猜");
        Long id = restTemplate.postForObject("http://fsh-house/house/save", houseInfo, Long.class);
        return id;
    }

}

