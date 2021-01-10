package com.zc.pattern.strategy.promotion;

/**
 * @ClassName GroupBuyStrategy
 * @Author 周聪
 * @Date 2021/1/10 18:05
 * @Version 1.0
 * @Description 团购
 */
public class GroupBuyStrategy implements PromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("拼团，满20人成团，全团享受团购价格");
    }
}
