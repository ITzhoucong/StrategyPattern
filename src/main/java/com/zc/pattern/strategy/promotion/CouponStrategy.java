package com.zc.pattern.strategy.promotion;

/**
 * @ClassName CouponStrategy
 * @Author 周聪
 * @Date 2021/1/10 18:01
 * @Version 1.0
 * @Description 优惠券抵扣
 */
public class CouponStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("领取优惠券，课程的价格直接减去优惠券面值抵扣");
    }
}
