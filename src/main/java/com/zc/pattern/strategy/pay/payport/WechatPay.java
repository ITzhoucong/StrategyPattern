package com.zc.pattern.strategy.pay.payport;

/**
 * @ClassName WechatPay
 * @Author 周聪
 * @Date 2021/1/10 19:46
 * @Version 1.0
 * @Description
 */
public class WechatPay extends Payment {
    @Override
    public String getName() {
        return "微信支付";
    }

    @Override
    protected double queryBalance(String uid) {
        return 256;
    }
}
