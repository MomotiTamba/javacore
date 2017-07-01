package com.kitcenter.runners.classwork.lesson19;


import com.kitcenter.app.classwork.lesson19.OrderPair;
import com.kitcenter.app.classwork.lesson19.OrderUtil;

public class OrderPairRunner {
    public static void main(String[] args) {

        OrderPair<String, Integer> p1 = new OrderPair<>("Even", 8);
        OrderPair<String, Integer> p2 = new OrderPair<>("Odd", 11);

        boolean same = OrderUtil.compare(p1, p2);
        System.out.println(same);
    }
}
