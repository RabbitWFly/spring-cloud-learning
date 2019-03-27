package com.rabbit.common.support;

import java.util.Map;

/**
 * @Author chentao
 * Date 2019/3/27
 * Description
 **/
public interface RibbonFilterContext {
    RibbonFilterContext add(String key, String value);

    String get(String key);

    RibbonFilterContext remove(String key);

    Map<String, String> getAttributes();
}

