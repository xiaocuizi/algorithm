package com.gemini.interfacedesigin.dip;

import javax.validation.constraints.Email;

/**
 * 接口设计之依赖倒置
 *
 * @author xiaocuizi
 * @since 0.0.1 2020/4/20 15:16
 */
public class DependeyInversion {

    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
    }

    static class Person {
        public void receive(Email email) {
            email.getInfo();
        }
    }

    static class Email {
        public String getInfo() {
            return "电子邮件信息：hello World.";
        }
    }
}
