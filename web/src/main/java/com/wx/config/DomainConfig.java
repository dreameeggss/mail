package com.wx.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@Configuration
public class DomainConfig {

    @Resource
    private Environment environment;


    /**
     * 百度查询IP地址url
     * @return  IP地址
     */
    public String getBaiDuURL(){
        return environment.getProperty("baidu.map.url","http://api.map.baidu.com/location/ip?ak=t1Nc9Alk7h44LOhO82ESVKOnaenH666Q&coor=bd09ll&ip=");
    }

    @Bean
    public RestTemplate create(){
        return new RestTemplate();
    }
}
