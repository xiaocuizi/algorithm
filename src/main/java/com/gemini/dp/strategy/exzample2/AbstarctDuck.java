package com.gemini.dp.strategy.exzample2;

/**
 * todo (用一句话描述该文件做什么)
 *
 * @author xiaocuizi
 * @since 0.0.1 2020/4/26 9:47
 */
public abstract class AbstarctDuck  {
    public abstract void display();

    public void quack(){
        System.out.println("鸭子嘎嘎叫。。。");
    }
    public void swim(){
        System.out.println("鸭子会游泳。。。。。。。");
    }

    public void fly(){
        System.out.println("燕子会飞翔、、、、、、、、");
    }
}
