package com.tong.controller;

import com.tong.pojo.Common;
import com.tong.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 童纯盼
 * @date 2022/1/11 14:16
 */
@RestController
public class FeignController {
    @Autowired
    private FeignService feignService;
    @GetMapping("/consumer/feign/order/{id}")
    public Common ConsumerFeignOrder(@PathVariable("id")int id){
        return feignService.getPayment(id);
    }
}
