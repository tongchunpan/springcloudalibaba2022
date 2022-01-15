package com.tong.controller;

import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.tong.service.FeignHystrixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author 童纯盼
 * @date 2022/1/11 14:16
 */
@RestController
@DefaultProperties(defaultFallback = "globalDefaultMethod")
public class FeignHystrixController {
    @Autowired
    private FeignHystrixService feignHystrixService;

    @HystrixCommand(fallbackMethod = "defaultMethod",commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds" ,value = "3000")
    })
    @GetMapping("/consumer/timeout/{id}")
    public String timeout(@PathVariable("id") int id) {
        return feignHystrixService.timeout(id);
    }
    @GetMapping("/consumer/success/{id}")
    public String success(@PathVariable("id") int id) {
        return feignHystrixService.success(id);
    }
    public String defaultMethod(@PathVariable("id" ) int id){
        return "异常";
    }
    public String globalDefaultMethod(){
        return "全局的异常处理";
    }

    //===============服务熔断=========================


    @HystrixCommand(fallbackMethod = "payDefaultMethod",commandProperties = {
            @HystrixProperty(name = "circuitBreaker.enabled",value = "true"),//是否开启服务熔断
            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold",value = "10"),//请求次数
            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds",value = "10000"),//时间窗口期
            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage",value = "60"),//失败率达到多少后跳闸

    })
    public String paymentCircuitBreaker(@PathVariable("id") int id){
        if (id < 0){
            throw new RuntimeException("不能小于0");
        }
        String s = new UUID(1, 10).toString();
        return s;

    }
    public String payDefaultMethod(@PathVariable("id") int id){
        return "payDefaultMethod";
    }















}
