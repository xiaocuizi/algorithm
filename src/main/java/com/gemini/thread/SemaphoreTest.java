package com.gemini.thread;

import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.LockSupport;

/**
 * todo (用一句话描述该文件做什么)
 *
 * @author xiaocuizi
 * @since 0.0.1 2020/3/26 13:48
 */
public class SemaphoreTest {
    static Thread t1 = null;
    static Thread t2 = null;
    static Thread t3 = null;
   static Semaphore semaphore = new Semaphore(1);
    public static void main(String[] args) {
        t1 = new Thread(() -> {
            diGet();
        }, "T1");

        t2 = new Thread(() -> {
            diGet();

        }, "T2");

        t3 = new Thread(() -> {
            diGet();
        }, "T3");

        t1.start();
        t2.start();
        t3.start();
    }

    private static void diGet() {
        try {
            semaphore.acquire();
            System.out.printf("%s%n",Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release();
        }
    }
}
