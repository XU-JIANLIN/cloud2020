package com.gdpuxjl.springcloud.controller;

import com.gdpuxjl.springcloud.VO.ResultVO;
import com.gdpuxjl.springcloud.pojo.Payment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author xujianlin
 * @version 1.0
 * @date 2020/12/16 14:59
 */
@RestController
public class OrderController {

//    private final static String PAYMENT_URL = "http://localhost:8001";
    private final static String PAYMENT_URL = "http://CLOUD-PAYMENT-SERVICE";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment/create")
    public ResultVO<Payment> create(Payment  payment){
        return restTemplate.postForObject(PAYMENT_URL+"/payment/create",payment,ResultVO.class);
    }

    @GetMapping("/consumer/payment/get/{id}")
    public ResultVO<Payment> getPayment(@PathVariable("id") Long id){
        return restTemplate.getForObject(PAYMENT_URL+"/payment/get/"+id,ResultVO.class);
    }


}
