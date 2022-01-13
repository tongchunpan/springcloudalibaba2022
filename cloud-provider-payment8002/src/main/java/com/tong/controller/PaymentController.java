package com.tong.controller;

import com.tong.pojo.Common;
import com.tong.pojo.PaymentDO;
import com.tong.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * @author 童纯盼
 * @date 2022/1/10 8:56
 */
@RestController
public class PaymentController {
    @Autowired
    private PaymentService paymentService;
    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/payment/get/{id}")
    public Common getPayment(@PathVariable("id") int id){
        PaymentDO paymentById = paymentService.getPaymentById(id);
        if (paymentById != null){
            return new Common(200,"查询成功 server = "+serverPort,paymentById);
        }else {
            return new Common(444,"查询失败");
        }
    }

    @PostMapping("/payment/create")
    public Common createPayment(@RequestBody PaymentDO paymentDO){
        int i = paymentService.create(paymentDO);
        if (i>0){
            return new Common(200,"添加成功   server = "+serverPort);
        }else{
            return new Common(444,"添加失败");
        }
    }

}
