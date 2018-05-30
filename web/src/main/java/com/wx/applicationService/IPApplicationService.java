package com.wx.applicationService;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import com.wx.auth.reponsitory.UserReponsitory;
import com.wx.config.DomainConfig;
import com.wx.exceptions.OperationException;
import org.apache.commons.lang3.StringUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@Service
public class IPApplicationService {

    @Resource
    private DomainConfig domainConfig;

    @Resource
    private RestTemplate restTemplate;

    @Resource
    private UserReponsitory userReponsitory;

    /**
     * 根据ip定位
     * @param ip ip地址
     */
    public JSONObject findIP(String ip){
        String url=domainConfig.getBaiDuURL()+ip;
        if(StringUtils.isNotBlank(ip)){
            try {
                ResponseEntity<JSONObject> jsonObject=restTemplate.getForEntity(url,JSONObject.class);
                return jsonObject.getBody();
            }catch (HttpClientErrorException e){
                throw new OperationException(JSON.parseObject(e.getResponseBodyAsString()).getString("message"));
            }
        }
        return null;
    }

}
