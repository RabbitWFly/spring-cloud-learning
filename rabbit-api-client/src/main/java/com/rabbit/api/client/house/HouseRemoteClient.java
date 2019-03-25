package com.rabbit.api.client.house;

import com.rabbit.api.client.house.dto.HouseInfoDto;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Author chentao
 * Date 2019/3/16
 * Description
 **/
@FeignClient(value = "fsh-house", path="/house")
public interface HouseRemoteClient {

    @GetMapping("/{houseId}")
    HouseInfoDto houseInfo(@PathVariable("houseId") Long houseId);

    @GetMapping("/hello")
    String hello();
}

