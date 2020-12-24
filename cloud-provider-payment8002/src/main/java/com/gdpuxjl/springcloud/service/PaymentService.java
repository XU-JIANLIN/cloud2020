package com.gdpuxjl.springcloud.service;

import com.gdpuxjl.springcloud.pojo.Payment;

public interface PaymentService {
    public int create(Payment payment);

    public Payment getPaymentById(Long id);
}
