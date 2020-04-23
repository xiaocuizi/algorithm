package com.gemini.dp.factory.pizzastore.pizza;

/**
 * todo (用一句话描述该文件做什么)
 *
 * @author xiaocuizi
 * @since 0.0.1 2020/4/21 15:05
 */
public class PepperPizza extends AbstractPizza {
    @Override
    public void prepare() {
        System.out.println("给胡椒pizza配原料");
    }
}
