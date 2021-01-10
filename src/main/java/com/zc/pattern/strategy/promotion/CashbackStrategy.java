package com.zc.pattern.strategy.promotion;

/**
 * @ClassName CashbackStrategy
 * @Author 周聪
 * @Date 2021/1/10 18:04
 * @Version 1.0
 * @Description 返现
 */
public class CashbackStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("返现促销，返回的金额转到支付宝账号");
    }
}
