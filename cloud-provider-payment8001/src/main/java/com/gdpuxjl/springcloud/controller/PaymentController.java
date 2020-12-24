package com.gdpuxjl.springcloud.controller;

import com.gdpuxjl.springcloud.VO.ResultVO;
import com.gdpuxjl.springcloud.pojo.Payment;
import com.gdpuxjl.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author xujianlin
 * @version 1.0
 * @date 2020/12/16 14:08
 */
@RestController
@RequestMapping("/payment")
@Slf4j
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @PostMapping("/create")
    public ResultVO create(@RequestBody Payment payment) {

        int flag = paymentService.create(payment);
        log.info("********插入结果" + flag);
        int a = 10/2;
        if (flag > 0) {
            return new ResultVO(200, "插入数据库成功", flag);
        } else {
            return new ResultVO(201,"插入数据库失败");
        }

    }
    @GetMapping("/get/{id}")
    public ResultVO getPaymentById(@PathVariable("id") Long id) {

        Payment payment = paymentService.getPaymentById(id);
        log.info("********插入成功" + payment);
        if (payment != null) {
            return new ResultVO(200, "查询成功", payment);
        } else {
            return new ResultVO(201,"查询失败");
        }

    }
}
