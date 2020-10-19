package com.gemini.thread;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.LockSupport;

/**
 * 多线程交替打印数字
 *
 * @author xiaocuizi
 * @since 0.0.1
 * @date 2020/3/26 12:56
 */
public class PrintNum {
    private static Object obj = new Object();
    private static CountDownLatch latch = new CountDownLatch(1);
    static Thread t1 = null;
    static Thread t2 = null;
    static Thread t3 = null;
    static volatile int i = 1;

    public static void main(String[] args) throws InterruptedException {
//        print();
//         print2();
            print3();
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

    private static void print3(){

        char[] nums = "123456".toCharArray();
        char[] words = "ABCDEF".toCharArray();
        new Thread(() -> {
            synchronized (obj) {
                for (char num : nums) {
                    System.out.printf("%s", num);
                    try {
                        obj.notify();
                        obj.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                obj.notify();
            }
        }, "T1").start();

        new Thread(() -> {
            synchronized (obj) {
                for (char c : words) {
                    try {
                        System.out.printf("%s", c);
                        obj.notify();
                        obj.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                obj.notify();
            }
        }, "T2").start();
    }

}
