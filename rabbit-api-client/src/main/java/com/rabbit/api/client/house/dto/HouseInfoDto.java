package com.rabbit.api.client.house.dto;

/**
 * @Author chentao
 * Date 2019/3/25
 * Description
 **/
public class HouseInfoDto {
    private HouseInfo data;

    public HouseInfoDto(HouseInfo data) {
        data = this.data;
    }

    public HouseInfoDto() {

    }

    public HouseInfo getData() {
        return data;
    }

    public void setData(HouseInfo data) {
        this.data = data;
    }
}

