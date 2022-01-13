package com.tong.service;

import com.tong.pojo.PaymentDO;
import org.apache.ibatis.annotations.Param;

/**
 * @author 童纯盼
 * @date 2022/1/10 8:56
 */
public interface PaymentService {
    int create(PaymentDO payment);
    PaymentDO getPaymentById(@Param("id") int id);
}
