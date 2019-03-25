package com.rabbit.api.client.house.dto;

import java.util.List;

/**
 * @Author chentao
 * Date 2019/3/25
 * Description
 **/
public class HouseListDto {

    private List<HouseInfo> data;

    public List<HouseInfo> getData() {
        return data;
    }

    public void setData(List<HouseInfo> data) {
        this.data = data;
    }
}

