package com.tong.controller;

import com.tong.service.HystrixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 童纯盼
 * @date 2022/1/13 13:49
 */
@RestController
public class HystrixController {
    @Autowired
    private HystrixService hystrixService;

    @GetMapping("/timeout/{id}")
    public String timeout(@PathVariable("id")int id){
        return hystrixService.timeout(id);
    }
    @GetMapping("/success/{id}")
    public String success(@PathVariable("id")int id){
        int a = 10 /0;
        return hystrixService.success(id);
    }
}
