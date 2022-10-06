package com.fan.springbootdemo.controller;


import com.fan.springbootdemo.entity.Payment;
import com.fan.springbootdemo.mapper.PaymentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/fan")
public class paymentController {
    @Autowired
    private PaymentMapper paymentMapper;

    @RequestMapping("/demo")
    @ResponseBody
    public Payment HelloWord(){
        Payment payment = paymentMapper.selectByPrimaryKey(31l);
        System.out.println("hello");
        System.out.println("hello2");
        System.out.println("hello3");
        System.out.println("hello4");
        return payment;
    }
}
