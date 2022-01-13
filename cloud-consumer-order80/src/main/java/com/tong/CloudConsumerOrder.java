package com.tong;

import com.Irule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @author 童纯盼
 * @date 2022/1/10 10:01
 */
@SpringBootApplication
//开启eureka客户端
@EnableEurekaClient
//自定义ribbonClient负载均衡的规则
@RibbonClient(name = "CLOUD-PROVIDER-PAYMENT",configuration = MySelfRule.class)
public class CloudConsumerOrder {
    public static void main(String[] args) {
        SpringApplication.run(CloudConsumerOrder.class,args);
    }
}
