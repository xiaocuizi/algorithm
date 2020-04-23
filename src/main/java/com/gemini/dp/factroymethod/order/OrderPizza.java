package com.gemini.dp.factroymethod.order;


import com.gemini.dp.factroymethod.AbstractPizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 订购
 *
 * @author xiaocuizi
 * @since 0.0.1 2020/4/21 11:02
 */
public abstract class OrderPizza {


    public OrderPizza() {
        AbstractPizza pizza = null;
        // 类型
        String orderType;

        do {
            orderType = getType();
            // 抽象方法，由工厂子类完成
            pizza = createPizza(orderType);
            if (pizza == null) {
                System.out.println("程序退出..");
                break;
            }
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        } while (true);
    }

    //
    abstract AbstractPizza createPizza(String orderType);


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
