package com.zc.pattern.strategy.pay.payport;

/**
 * @ClassName UnionPay
 * @Author 周聪
 * @Date 2021/1/10 19:47
 * @Version 1.0
 * @Description 银联支付
 */
public class UnionPay extends Payment {
    @Override
    public String getName() {
        return "银联支付";
    }

    @Override
    protected double queryBalance(String uid) {
        return 120;
    }
}
