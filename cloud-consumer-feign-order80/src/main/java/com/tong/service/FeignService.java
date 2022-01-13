package com.tong.service;

import com.tong.pojo.Common;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author 童纯盼
 * @date 2022/1/11 14:15
 */
@Component
//Feign客户端请求提供者的名字
@FeignClient(value = "CLOUD-PROVIDER-PAYMENT")
public interface FeignService {
    @GetMapping("/payment/get/{id}")
    Common getPayment(@PathVariable("id") int id);
}
