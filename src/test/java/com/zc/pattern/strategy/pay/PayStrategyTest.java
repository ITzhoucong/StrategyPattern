package com.zc.pattern.strategy.pay;

import com.zc.pattern.strategy.pay.payport.PayStrategy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/**
 * @ClassName PayStrategyTest
 * @Author 周聪
 * @Date 2021/1/10 19:48
 * @Version 1.0
 * @Description
 */
public class PayStrategyTest {

    public static void main(String[] args) {
        Order order = new Order("1", "2021110", 1342.45);
        MsgResult result = order.pay(PayStrategy.ALI_PAY);
        System.out.println(result);
    }

}
