package com.distance.tsc.alipay.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.distance.tsc.alipay.client.AlipayMessageClient;
import com.distance.tsc.alipay.pojo.AlipayTradeOrder;
import com.distance.tsc.alipay.service.IAlipayService;

import java.math.BigDecimal;

@RestController
@RequestMapping("alipay")
public class AlipayController {

    @Autowired
    IAlipayService iAlipayService;
    @Autowired
    AlipayMessageClient alipayMessageClient;

    @PostMapping("transferAlipayToPersonal/{amount}")
    public ResponseEntity tranferToBalanceTreasure(@PathVariable BigDecimal amount){
        Long userId = 10180L;
        String messageId = iAlipayService.transferAlipayToPersonalBalance(userId, amount);
        //异常测试，抛个异常
//        int i = 1/0;
        //确认提交消息 通知个人账户进行加款
        alipayMessageClient.confirmAndSendMessage(messageId);
        return ResponseEntity.ok("success");
    }

    @PostMapping("personalBalanceSuccess/{orderNo}")
    public boolean personalBalanceSuccess(@PathVariable String orderNo){
        iAlipayService.doOrderSuccess(orderNo);
        return true;
    }

    @GetMapping("queryOrderStatus/{orderNo}")
    public String queryOrderStatus(@PathVariable String orderNo){

        AlipayTradeOrder order = iAlipayService.getCapitalTradeOrderByOderNo(orderNo);
        if (order != null){
            return order.getStatus();
        }
        return null;
    }

}
