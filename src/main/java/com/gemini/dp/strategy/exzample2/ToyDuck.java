package com.gemini.dp.strategy.exzample2;

/**
 * todo (用一句话描述该文件做什么)
 *
 * @author xiaocuizi
 * @since 0.0.1 2020/4/26 9:49
 */
public class ToyDuck extends AbstarctDuck {
    @Override
    public void display() {
        System.out.println("玩具鸭子...");
    }

    @Override
    public void quack() {
        System.out.println("玩具鸭不能叫...");
    }

    @Override
    public void swim() {
        System.out.println("玩具鸭不会游泳...");
    }

    @Override
    public void fly() {
        System.out.println("玩具鸭不会飞翔...");
    }
}
