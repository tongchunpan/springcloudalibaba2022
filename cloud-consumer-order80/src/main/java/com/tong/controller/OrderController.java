package com.tong.controller;

import com.tong.pojo.Common;
import com.tong.pojo.PaymentDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


/**
 * @author 童纯盼
 * @date 2022/1/10 9:49
 */
@RestController
public class OrderController {
    private static final String url = "http://CLOUD-PROVIDER-PAYMENT";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment/get/{id}")
    public Common consumerPaymentGet(@PathVariable("id") int id) {
        return restTemplate.getForObject(url +"/payment/get/"+ id, Common.class);
    }

    @PostMapping("/comsumer/payment/create")
    public Common consumerPaymentCreate(PaymentDO paymentDO) {
        return restTemplate.postForObject(url+"/payment/create",paymentDO,Common.class);
    }

}
