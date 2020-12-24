package com.gdpuxjl.springcloud.controller;

import org.hibernate.validator.constraints.pl.REGON;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author xujianlin
 * @version 1.0
 * @date 2020/12/24 16:19
 */
@RestController
@RequestMapping("/consumer")
public class OrderController {

    private final static String REQ_URL = "http://cloud-provider-payment";


    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/payment/zk")
    public String pymentzk(){
        return restTemplate.getForObject(REQ_URL+"/payment/zk",String.class);
    }
}
