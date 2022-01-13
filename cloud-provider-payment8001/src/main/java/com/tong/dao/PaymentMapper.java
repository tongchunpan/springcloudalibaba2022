package com.tong.dao;

import com.tong.pojo.PaymentDO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author 童纯盼
 * @date 2022/1/10 8:58
 */
@Mapper
public interface PaymentMapper {
    int create(PaymentDO payment);
    PaymentDO getPaymentById(@Param("id") int id);
}
