package com.tong.service;

import com.mysql.jdbc.TimeUtil;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;

/**
 * @author 童纯盼
 * @date 2022/1/13 13:49
 */
@Service
public class HystrixService {
    @HystrixCommand(fallbackMethod = "defaultMethod",commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "3000")
    })
    public String timeout(int id){
        try {
            int age = 10/0;
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "当前线程名为"+Thread.currentThread().getName()+"id:"+id;
    }
    public String success(int id){

        return "当前线程名称"+Thread.currentThread().getName()+"id"+id;
    }

    public String defaultMethod(int id){
        return "系统繁忙："+id;
    }


}
