package com.gemini.dp.factory.pizzastore.pizza;

/**
 * todo (用一句话描述该文件做什么)
 *
 * @author xiaocuizi
 * @since 0.0.1 2020/4/21 11:00
 */
public class GreekPizza extends AbstractPizza {
    @Override
    public void prepare() {
        System.out.println("希腊Pizza准备原材料");
    }
}
