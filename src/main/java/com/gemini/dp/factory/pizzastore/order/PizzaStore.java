package com.gemini.dp.factory.pizzastore.order;

/**
 * 类似一个客户端
 *
 * @author xiaocuizi
 * @since 0.0.1 2020/4/21 14:55
 */
public class PizzaStore {
    public static void main(String[] args) {
        // new OrderPizza();
        // 簡單工廠模式
        new OrderPizza(new SimpleFactory());
        System.out.println("退出程序");
    }
}
