package com.rabbit.fsh.api.config;

import com.rabbit.fsh.api.filter.ErrorFilter;
import com.rabbit.fsh.api.filter.IpFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author chentao
 * Date 2019/3/28
 * Description 过滤器配置
 **/
@Configuration
public class FilterConfig {

    @Bean
    public IpFilter ipFilter(){
        return new IpFilter();
    }

    @Bean
    public ErrorFilter errorFilter(){
        return new ErrorFilter();
    }

}

