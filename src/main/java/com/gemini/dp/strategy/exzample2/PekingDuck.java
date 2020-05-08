package com.gemini.dp.strategy.exzample2;

/**
 * todo (用一句话描述该文件做什么)
 *
 * @author xiaocuizi
 * @since 0.0.1 2020/4/26 9:49
 */
public class PekingDuck extends AbstarctDuck {
    @Override
    public void display() {
        System.out.println("这是北京鸭子...");
    }

    @Override
    public void fly() {
        System.out.println("北京鸭不能飞翔...");
    }
}
