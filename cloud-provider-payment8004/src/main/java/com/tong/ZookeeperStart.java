package com.tong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author 童纯盼
 * @date 2022/1/11 9:24
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ZookeeperStart {
    public static void main(String[] args) {
        SpringApplication.run(ZookeeperStart.class,args);
        System.out.println("hello test");
    }
}
