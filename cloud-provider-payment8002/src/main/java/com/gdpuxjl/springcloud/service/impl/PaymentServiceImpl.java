package com.gdpuxjl.springcloud.service.impl;

import com.gdpuxjl.springcloud.dao.PaymentDao;
import com.gdpuxjl.springcloud.pojo.Payment;
import com.gdpuxjl.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author xujianlin
 * @version 1.0
 * @date 2020/12/16 14:06
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
