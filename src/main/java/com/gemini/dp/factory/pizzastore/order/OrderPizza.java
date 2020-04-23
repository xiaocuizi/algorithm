package com.gemini.dp.factory.pizzastore.order;

import com.gemini.dp.factory.pizzastore.pizza.AbstractPizza;
import com.gemini.dp.factory.pizzastore.pizza.CheesePizza;
import com.gemini.dp.factory.pizzastore.pizza.GreekPizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 订购
 *
 * @author xiaocuizi
 * @since 0.0.1 2020/4/21 11:02
 */
public class OrderPizza {


    public OrderPizza(SimpleFactory simpleFactory) {
        // AbstractPizza pizza = null;
        // // 类型
        // String orderType;
        //
        // do {
        //     orderType = getType();
        //     if (orderType.equals("greek")) {
        //         pizza = new GreekPizza();
        //         pizza.setName("希腊");
        //     } else if (orderType.equals("cheese")) {
        //         pizza = new CheesePizza();
        //         pizza.setName("奶酪");
        //     } else if (orderType.equals("pepper")) {
        //         pizza = new CheesePizza();
        //         pizza.setName("胡椒披萨");
        //     } else {
        //         break;
        //     }
        //     pizza.prepare();
        //     pizza.bake();
        //     pizza.cut();
        //     pizza.box();
        // } while (true);
        setSimpleFactory(simpleFactory);
    }

    SimpleFactory simpleFactory;
    AbstractPizza pizza = null;

    public void setSimpleFactory(SimpleFactory simpleFactory) {
        this.simpleFactory = simpleFactory;
        do {
            String orderType = getType();
            pizza = simpleFactory.createPizza(orderType);
            if (pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println("對不起，沒有這個披薩");
                break;
            }
        } while (true);
    }

    private String getType() {
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza 种类:");
            String str = strin.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
