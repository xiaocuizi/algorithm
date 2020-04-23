package com.gemini.dp.factroymethod.order;

import com.gemini.dp.factory.pizzastore.pizza.CheesePizza;
import com.gemini.dp.factroymethod.*;

/**
 * todo (用一句话描述该文件做什么)
 *
 * @author xiaocuizi
 * @since 0.0.1 2020/4/21 16:52
 */
public class LDOrderPizza extends OrderPizza {
    @Override
    AbstractPizza createPizza(String orderType) {
        AbstractPizza pizza = null;
        if(orderType.equals("cheese")){
            pizza = new LDCheesePizza();
            pizza.setName("伦敦奶酪");
        }else if(orderType.equals("pepper")){
            pizza = new LDPepperPizza();
            pizza.setName("伦敦胡椒");
        }
        return null;
    }
}
