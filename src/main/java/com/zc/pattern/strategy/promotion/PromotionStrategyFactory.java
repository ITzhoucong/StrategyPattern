package com.zc.pattern.strategy.promotion;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @ClassName PromotionStrategyFactory
 * @Author 周聪
 * @Date 2021/1/10 18:28
 * @Version 1.0
 * @Description 简单工厂+ 注册式饿汉式单例
 */
public class PromotionStrategyFactory {

    private static final Map<String,PromotionStrategy> PROMOTION_STRATEGY_MAP = new ConcurrentHashMap<String,PromotionStrategy>();

    private static final PromotionStrategy NON_PROMOTION = new EmptyStrategy();

    static {
        PROMOTION_STRATEGY_MAP.put(PromotionKey.COUPON,new CouponStrategy());
        PROMOTION_STRATEGY_MAP.put(PromotionKey.CASHBACK,new CashbackStrategy());
        PROMOTION_STRATEGY_MAP.put(PromotionKey.GROUPBUY,new GroupBuyStrategy());
    }


    private PromotionStrategyFactory(){}

    public static PromotionStrategy getPromotionStrategy(String promotionKey){
        PromotionStrategy promotionStrategy = PROMOTION_STRATEGY_MAP.get(promotionKey);
        return promotionStrategy == null ? NON_PROMOTION : promotionStrategy;
    }

    private interface PromotionKey{
        String COUPON = "COUPON";
        String CASHBACK = "CASHBACK";
        String GROUPBUY = "GROUPBUY";

    }
}
