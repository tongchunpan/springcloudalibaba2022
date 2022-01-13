package com.tong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author 童纯盼
 * @date 2022/1/11 14:14
 */
@SpringBootApplication
//开启Eureka客户端
@EnableEurekaClient
//开启Feign客户端
@EnableFeignClients
public class FeignOrderStart {
    public static void main(String[] args) {
        System.out.println("这是我使用Dev分支");
        SpringApplication.run(FeignOrderStart.class,args);
    }
}
