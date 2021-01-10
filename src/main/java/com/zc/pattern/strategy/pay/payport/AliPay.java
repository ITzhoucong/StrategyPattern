package com.zc.pattern.strategy.pay.payport;

/**
 * @ClassName AliPay
 * @Author 周聪
 * @Date 2021/1/10 18:54
 * @Version 1.0
 * @Description 支付宝支付
 */
public class AliPay extends Payment{
    @Override
    public String getName() {
        return "支付宝";
    }

    @Override
    protected double queryBalance(String uid) {
        return 900;
    }
}
