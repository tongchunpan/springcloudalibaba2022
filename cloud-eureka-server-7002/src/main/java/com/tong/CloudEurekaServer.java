package com.tong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author 童纯盼
 * @date 2022/1/10 13:50
 */
@SpringBootApplication
@EnableEurekaServer
public class CloudEurekaServer {
    public static void main(String[] args) {
        SpringApplication.run(CloudEurekaServer.class,args);
    }
}
