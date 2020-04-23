package com.gemini.dp.factroymethod.order;

import com.gemini.dp.factroymethod.AbstractPizza;
import com.gemini.dp.factroymethod.BJCheesePizza;
import com.gemini.dp.factroymethod.BJPepperPizza;

/**
 * todo (用一句话描述该文件做什么)
 *
 * @author xiaocuizi
 * @since 0.0.1 2020/4/21 16:52
 */
public class BJOrderPizza extends OrderPizza {
    @Override
    AbstractPizza createPizza(String orderType) {
        AbstractPizza pizza = null;
        if(orderType.equals("cheese")){
            pizza = new BJCheesePizza();
            pizza.setName("北京奶酪");
        }else if(orderType.equals("pepper")){
            pizza = new BJPepperPizza();
            pizza.setName("北京胡椒");
        }
        return pizza;
    }
}
