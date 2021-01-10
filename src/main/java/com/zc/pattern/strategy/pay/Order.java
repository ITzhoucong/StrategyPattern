package com.zc.pattern.strategy.pay;

import com.zc.pattern.strategy.pay.payport.PayStrategy;
import com.zc.pattern.strategy.pay.payport.Payment;

/**
 * @ClassName Order
 * @Author 周聪
 * @Date 2021/1/10 18:48
 * @Version 1.0
 * @Description
 */
public class Order {

    private String uid;
    private String orderId;
    private double amount;

    public Order(String uid, String orderId, double amount) {
        this.uid = uid;
        this.orderId = orderId;
        this.amount = amount;
    }

    public MsgResult pay(String payKey){
        Payment payment = PayStrategy.get(payKey);
        System.out.println("欢迎使用" + payment.getName());
        System.out.println("本次交易金额为：" + amount + ",开始扣款...");
        return payment.pay(uid,amount);
    }

    @Override
    public String toString() {
        return "Order{" +
                "uid='" + uid + '\'' +
                ", orderId='" + orderId + '\'' +
                ", amount=" + amount +
                '}';
    }
}
