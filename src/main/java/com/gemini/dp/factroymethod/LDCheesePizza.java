package com.gemini.dp.factroymethod;

/**
 * todo (用一句话描述该文件做什么)
 *
 * @author xiaocuizi
 * @since 0.0.1 2020/4/21 16:45
 */
public class LDCheesePizza extends AbstractPizza {
    @Override
    public void prepare() {
        System.out.println("伦敦奶酪披萨准备材料");
    }
}
