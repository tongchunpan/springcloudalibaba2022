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
//Feign客户端请求提供者的名字    fallback是使用实现接口的方式来实现服务降级
@FeignClient(value = "CLOUD-PROVIDER-HYSTRIX-PAYMENT" ,fallback = FeignHystrixServiceImpl.class)
public interface FeignHystrixService {
    @GetMapping("/timeout/{id}")
    String timeout(@PathVariable("id")int id);
    @GetMapping("/success/{id}")
    String success(@PathVariable("id")int id);
}
