package com.gemini.thread;

import java.util.concurrent.locks.LockSupport;

/**
 * 多线程交替打印数字
 *
 * @author xiaocuizi
 * @since 0.0.1
 * @date 2020/3/26 12:56
 */
public class PrintNum {
    static Thread t1 = null;
    static Thread t2 = null;
    static Thread t3 = null;
    static volatile int i = 1;

    public static void main(String[] args) {
//        print();
        print2();
    }


    private static void print2() {
        t1 = new Thread(() -> {
            while (i < 99) {
                System.out.printf("%s,t-name=%s%n",  i++, Thread.currentThread().getName());
                LockSupport.unpark(t2);
                LockSupport.park();
            }


        }, "T1");

        t2 = new Thread(() -> {
            doAdd(t3);

        }, "T2");

        t3 = new Thread(() -> {

            doAdd(t1);

        }, "T3");


        t1.start();
        t2.start();
        t3.start();

    }

    private static void doAdd(Thread t) {
        while (i < 99) {
            LockSupport.park();
            System.out.printf("%s,t-name=%s%n",  i++, Thread.currentThread().getName());
            LockSupport.unpark(t);
        }
        if (i > 99) {
            t1.interrupt();
            t2.interrupt();
            t3.interrupt();
        }
    }


    private static void print() {
        char[] nums = "123456".toCharArray();
        char[] words = "ABCDEF".toCharArray();
        t1 = new Thread(() -> {
            for (char num : nums) {
                System.out.printf("%s", num);
                LockSupport.unpark(t2);
                LockSupport.park();
            }

        }, "T1");

        t2 = new Thread(() -> {
            for (char c : words) {
                LockSupport.park();
                System.out.printf("%s", c);
                LockSupport.unpark(t1);
            }

        }, "T2");


        t1.start();
        t2.start();
    }

}
