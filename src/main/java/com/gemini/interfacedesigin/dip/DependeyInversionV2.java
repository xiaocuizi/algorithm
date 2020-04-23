package com.gemini.interfacedesigin.dip;

/**
 * 接口设计之依赖倒置
 * 中心思想：面向接口编程
 *
 * @author xiaocuizi
 * @since 0.0.1 2020/4/20 15:16
 */
public class DependeyInversionV2 {

    public static void main(String[] args) {
        Person person = new Person();

        System.out.println(person.receive(new Email()));

        System.out.println(person.receive(new Weixin()));
    }

    interface Ireceiver {
        String getInfo();
    }

    static class Person {
        public String receive(Ireceiver receiver) {
            return receiver.getInfo();
        }
    }

    static class Email implements Ireceiver {

        @Override
        public String getInfo() {
            return "电子邮件信息：hello World.";
        }
    }

    static class Weixin implements Ireceiver {

        @Override
        public String getInfo() {
            return "微信信息：hello kitty.";
        }
    }
}
