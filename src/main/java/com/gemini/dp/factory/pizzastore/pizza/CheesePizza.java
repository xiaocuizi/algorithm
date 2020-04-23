package com.gemini.dp.factory.pizzastore.pizza;

/**
 * todo (用一句话描述该文件做什么)
 *
 * @author xiaocuizi
 * @since 0.0.1 2020/4/20 20:37
 */
public class CheesePizza extends AbstractPizza {
    @Override
    public void prepare() {
        // 准备原材料
        System.out.println("奶酪Pizza准备原材料");
    }
}
