package com.tong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author 童纯盼
 * @date 2022/1/15 9:45
 */
@SpringBootApplication
@EnableEurekaClient
public class GatewayStart9527 {
    public static void main(String[] args) {
        SpringApplication.run(GatewayStart9527.class,args);
    }
}
