package com.zc.pattern.strategy.pay.payport;

/**
 * @ClassName JDPay
 * @Author 周聪
 * @Date 2021/1/10 19:45
 * @Version 1.0
 * @Description
 */
public class JDPay extends Payment{
    @Override
    public String getName() {
        return "京东白条";
    }

    @Override
    protected double queryBalance(String uid) {
        return 500;
    }
}
