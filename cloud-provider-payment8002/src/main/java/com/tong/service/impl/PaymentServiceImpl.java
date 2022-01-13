package com.tong.service.impl;

import com.tong.dao.PaymentMapper;
import com.tong.pojo.PaymentDO;
import com.tong.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 童纯盼
 * @date 2022/1/10 8:58
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Autowired
    private PaymentMapper paymentMapper;

    @Override
    public int create(PaymentDO payment) {
        return paymentMapper.create(payment);
    }

    @Override
    public PaymentDO getPaymentById(int id) {
        return paymentMapper.getPaymentById(id);
    }
}
