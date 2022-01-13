package com.tong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author 童纯盼
 * @date 2022/1/9 10:03
 */
@SpringBootApplication
@EnableEurekaClient
public class CloudProviderPayment {
    public static void main(String[] args) {
        SpringApplication.run(CloudProviderPayment.class,args);
    }
}
