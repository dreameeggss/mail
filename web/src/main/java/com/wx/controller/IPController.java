package com.wx.controller;


import com.alibaba.fastjson.JSONObject;

import com.wx.applicationService.IPApplicationService;
import com.wx.dto.ResponseDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

import static com.wx.config.UrlConstant.API_URL_PREFIX;


@Controller
@RequestMapping({API_URL_PREFIX})
@Slf4j
public class IPController {


    @Resource
    private IPApplicationService ipApplicationService;

    @GetMapping("/ip")
    public ResponseEntity findIP(String ip){
        log.info("待处理IP {}",ip);
        JSONObject jsonObject=ipApplicationService.findIP(ip);
        return new ResponseEntity<>(ResponseDTO.success(jsonObject), HttpStatus.OK);
    }
}
