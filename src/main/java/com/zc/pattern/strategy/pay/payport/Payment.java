package com.zc.pattern.strategy.pay.payport;

import com.zc.pattern.strategy.pay.MsgResult;

/**
 * @ClassName Payment
 * @Author 周聪
 * @Date 2021/1/10 18:55
 * @Version 1.0
 * @Description 支付抽象
 */
public abstract class Payment {

    /**
     * 支付信息
     * @return
     */
    public abstract String getName();

    /**
     * 余额
     * @param uid
     * @return
     */
    protected abstract double queryBalance(String uid);

    /**
     * 支付
     * @param uid
     * @param amount
     * @return
     */
    public MsgResult pay(String uid,double amount){
        if (queryBalance(uid) < amount){
            return new MsgResult(500,"支付失败","余额不足");
        }else {
            return new MsgResult(200,"支付成功","支付金额: " + amount);
        }
    }
}
