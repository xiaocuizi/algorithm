package com.gemini.dp.factory.pizzastore.order;

import com.gemini.dp.factory.pizzastore.pizza.AbstractPizza;
import com.gemini.dp.factory.pizzastore.pizza.CheesePizza;
import com.gemini.dp.factory.pizzastore.pizza.GreekPizza;

/**
 * 简单工厂模式
 *
 * @author xiaocuizi
 * @since 0.0.1 2020/4/21 15:17
 */
public class SimpleFactory {
    // 可以使用static
    public AbstractPizza createPizza(String orderType) {
        AbstractPizza pizza = null;
        if (orderType.equals("greek")) {
            pizza = new GreekPizza();
            pizza.setName("希腊");
        } else if (orderType.equals("cheese")) {
            pizza = new CheesePizza();
            pizza.setName("奶酪");
        } else if (orderType.equals("pepper")) {
            pizza = new CheesePizza();
            pizza.setName("胡椒披萨");
        }
        return pizza;
    }
}
