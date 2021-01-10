package com.zc.pattern.strategy.promotion;

/**
 * @ClassName EmptyStrategy
 * @Author 周聪
 * @Date 2021/1/10 17:59
 * @Version 1.0
 * @Description 无优惠
 */
public class EmptyStrategy implements PromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("无促销活动");
    }
}
