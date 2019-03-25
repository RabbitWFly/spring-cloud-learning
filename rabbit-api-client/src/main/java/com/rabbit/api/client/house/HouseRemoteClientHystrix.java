package com.rabbit.api.client.house;

import com.rabbit.api.client.house.dto.HouseInfoDto;

/**
 * @Author chentao
 * Date 2019/3/25
 * Description 服务调用熔断默认返回处理
 **/
public class HouseRemoteClientHystrix implements HouseRemoteClient {

    @Override
    public HouseInfoDto houseInfo(Long houseId) {
        return new HouseInfoDto();
    }

    @Override
    public String hello() {
        return null;
    }
}

