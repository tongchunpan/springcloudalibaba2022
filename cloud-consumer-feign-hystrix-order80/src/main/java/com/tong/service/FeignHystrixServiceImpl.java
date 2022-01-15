package com.tong.service;

import org.springframework.stereotype.Component;

/**
 * @author 童纯盼
 * @date 2022/1/14 10:31
 *
 * 使用实现接口的方式实现服务降级
 */
@Component
public class FeignHystrixServiceImpl implements FeignHystrixService{

    @Override
    public String timeout(int id) {
        return "使用实现接口的方式实现服务降级";
    }

    @Override
    public String success(int id) {
        return "使用实现接口的方式实现服务降级";
    }
}
