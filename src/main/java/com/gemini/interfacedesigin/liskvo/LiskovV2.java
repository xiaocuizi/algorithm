package com.gemini.interfacedesigin.liskvo;

/**
 * 接口设计之里氏替换原则
 * 中心思想：不要重写父类方法
 * ** 提取一个基类
 * ** 或者是组合关系
 * @author xiaocuizi
 * @since 0.0.1 2020/4/20 14:59
 */
public class LiskovV2 {


    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.fun1(7, 5));
        System.out.println("------------------");
        B b = new B();
        System.out.println(b.fun2(7, 5));
    }

    // 基类
    static class Base {
    }

    static class A extends Base {
        public int fun1(int num1, int num2) {
            return (num1 - num2);
        }
    }


    static class B extends Base {

        /**
         * 重写父类方法，可能是无意识的
         *
         * @param num1
         * @param num2
         * @return
         */
        public int fun1(int num1, int num2) {
            return num1 + num2;
        }

        public int fun2(int num1, int num2) {
            return fun1(num1, num2) + 9;
        }
    }
}
