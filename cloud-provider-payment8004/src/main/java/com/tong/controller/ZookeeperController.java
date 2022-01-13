package com.tong.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author 童纯盼
 * @date 2022/1/11 9:22
 */
@RestController
public class ZookeeperController {
    @GetMapping("/zookeeper")
    public String ping(){
        UUID uuid = new UUID(1,10);
        return uuid.toString();
    }
}
