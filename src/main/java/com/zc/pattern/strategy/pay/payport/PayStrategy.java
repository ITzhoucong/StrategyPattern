package com.zc.pattern.strategy.pay.payport;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName PayStrategy
 * @Author 周聪
 * @Date 2021/1/10 19:51
 * @Version 1.0
 * @Description 支付策略工厂
 */
public class PayStrategy {

    public static final String ALI_PAY = "AliPay";
    public static final String JD_PAY = "JDPay";
    public static final String WECHAT_PAY = "WchatPay";
    public static final String UNION_PAY = "UnionPay";
    public static final String DEFAULT_PAY = "AliPay";

    private static Map<String,Payment> payStrategy = new HashMap<String,Payment>();

    static {
        payStrategy.put(ALI_PAY,new AliPay());
        payStrategy.put(JD_PAY,new JDPay());
        payStrategy.put(WECHAT_PAY,new WechatPay());
        payStrategy.put(UNION_PAY,new UnionPay());
        payStrategy.put(DEFAULT_PAY,new AliPay());
    }

    public static Payment get(String payKey){
        if (!payStrategy.containsKey(payKey)){
            return payStrategy.get(DEFAULT_PAY);
        }
            return payStrategy.get(payKey);

    }
}
