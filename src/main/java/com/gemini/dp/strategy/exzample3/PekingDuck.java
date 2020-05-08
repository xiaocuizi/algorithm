package com.gemini.dp.strategy.exzample3;

import com.gemini.dp.strategy.exzample2.AbstarctDuck;

/**
 * todo (用一句话描述该文件做什么)
 *
 * @author xiaocuizi
 * @since 0.0.1 2020/4/26 9:49
 */
public class PekingDuck extends Duck {

    public PekingDuck() {
        flyBehavior = new NotFlyBehavior();
    }
    @Override
    public void display() {
        System.out.println("这是北京鸭子...");
    }

}
