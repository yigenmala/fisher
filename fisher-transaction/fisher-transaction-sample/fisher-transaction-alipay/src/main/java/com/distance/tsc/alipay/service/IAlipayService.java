package com.distance.tsc.alipay.service;

import java.math.BigDecimal;

import com.distance.tsc.alipay.pojo.AlipayTradeOrder;


public interface IAlipayService {

    /**
     * 转账到个人账户
     * @param userId
     * @param amount
     */
    String transferAlipayToPersonalBalance(Long userId, BigDecimal amount);

    /**
     * 订单成功的处理
     * @param orderNo
     */
    void doOrderSuccess(String orderNo);

    /**
     *
     * @param orderNo
     * @return
     */
    AlipayTradeOrder getCapitalTradeOrderByOderNo(String orderNo);
}
