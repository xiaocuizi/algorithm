package com.gemini.dp.strategy.exzample3;

/**
 * todo (用一句话描述该文件做什么)
 *
 * @author xiaocuizi
 * @since 0.0.1 2020/4/26 10:24
 */
public class Client {

    public static void main(String[] args) {
        WildDuck wildDuck = new WildDuck();
        wildDuck.fly();
        ToyDuck toyDuck = new ToyDuck();
        toyDuck.fly();
    }
}
