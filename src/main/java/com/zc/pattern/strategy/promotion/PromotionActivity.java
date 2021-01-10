package com.zc.pattern.strategy.promotion;

/**
 * @ClassName PromotionActivity
 * @Author 周聪
 * @Date 2021/1/10 18:07
 * @Version 1.0
 * @Description 优惠活动
 */
public class PromotionActivity {

    PromotionStrategy promotionStrategy;

    public PromotionActivity(PromotionStrategy promotionStrategy){
        this.promotionStrategy = promotionStrategy;
    }

    /**
     * 执行优惠活动
     */
    public void execute(){
        this.promotionStrategy.doPromotion();
    }
}
