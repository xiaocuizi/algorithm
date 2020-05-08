package com.gemini.dp.iterator;

import java.util.*;

/**
 * todo (用一句话描述该文件做什么)
 *
 * @author xiaocuizi
 * @since 0.0.1 2020/4/29 10:23
 */
public class IteratorTest {
    public static void main(String[] args) {
        // List list = new ArrayList<>();
        // List list = Collections.synchronizedList(new ArrayList<>());
        List list = new Vector();
        list.add(8);
        list.add(7);
        list.add(6);
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                testRemoveListElements(list);
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                testRemoveListElements(list);
            }
        });

        thread.start();
        thread2.start();
    }

    private static void testRemoveListElements(List list) {
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + "-" + Thread.currentThread().getName());
            iterator.remove();
        }
    }
}
