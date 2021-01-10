package com.zc.pattern.strategy.promotion;

/**
 * @ClassName PromotionStrategy
 * @Author 周聪
 * @Date 2021/1/10 17:58
 * @Version 1.0
 * @Description 优惠策略的抽象
 */
public interface PromotionStrategy {

    /**
     * 执行优惠
     */
    void doPromotion();
}
