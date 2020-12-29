package com.atguigu.springcloud.service;

import org.springframework.stereotype.Component;

@Component
public class PaymentFallbakcService implements PaymentHystrixService {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "o(╥﹏╥)opaymentInfo_OK";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "o(╥﹏╥)paymentInfo_TimeOut";
    }
}
