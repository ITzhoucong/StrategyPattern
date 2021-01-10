package com.zc.pattern.strategy.promotion;

import org.apache.commons.lang3.StringUtils;

/**
 * @ClassName PromotionActivityTest
 * @Author 周聪
 * @Date 2021/1/10 18:10
 * @Version 1.0
 * @Description
 */
public class PromotionActivityTest {

/*    public static void main(String[] args) {
//        618优惠券活动
        PromotionActivity activity618 = new PromotionActivity(new CouponStrategy());
        activity618.execute();
//        双11返现活动
        PromotionActivity activity1111 = new PromotionActivity(new CashbackStrategy());
        activity1111.execute();

    }*/

   /* public static void main(String[] args) {
        PromotionActivity promotionActivity = null;

        String promotionKey = "COUPON";
        if (StringUtils.equals(promotionKey,"COUPON")){
            promotionActivity = new PromotionActivity(new CouponStrategy());
        }else if (StringUtils.equals(promotionKey,"CASHBACK")){
            promotionActivity = new PromotionActivity(new CashbackStrategy());
        } // .......

        promotionActivity.execute();
    }*/

    public static void main(String[] args) {
        String promotionKey = "GROUPBUY";
        PromotionActivity promotionActivity = new PromotionActivity(PromotionStrategyFactory.getPromotionStrategy(promotionKey));
        promotionActivity.execute();
    }

}
