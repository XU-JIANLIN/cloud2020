package com.gdpuxjl.springcloud.service;

import com.gdpuxjl.springcloud.pojo.Payment;
import org.apache.ibatis.annotations.Param;

public interface PaymentService {
    public int create(Payment payment);

    public Payment getPaymentById(Long id);
}
