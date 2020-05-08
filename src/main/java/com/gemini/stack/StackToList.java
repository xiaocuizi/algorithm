package com.gemini.stack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * 两个栈实现一个队列
 *
 * @author xiaocuizi
 * @since 0.0.1 2020/5/6 9:57
 */
public class StackToList {

    public static void main(String[] args) {
        // list();
        LinkedList<String> q1 = new LinkedList<String>();
        LinkedList<String> q2 = new LinkedList<String>();
        q1.add("A");
        q1.add("B");
        q1.add("C");
        // 出队
        for (String e : q1) {
            if (q1.size() <= 1) {
                System.out.println(q1.poll());
            } else {
                q2.add(q1.poll());
            }
        }
    }

    private static void list() {
        Stack<Integer> input = new Stack<>();
        Stack<Integer> output = new Stack<>();
        List<Integer> integerList = new ArrayList<>(6);
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);
        integerList.add(6);
        LinkedList<Integer> integers = new LinkedList<>();

        for (Integer e : integerList) {
            while (output.isEmpty()) {
                input.push(e);
                while (!input.isEmpty()) {
                    output.push(input.pop());
                }
            }
            while (!output.isEmpty()) {
                integers.add(output.pop());
            }
        }


        // while (!output.isEmpty()) {
        //     System.out.println(output.pop());
        // }

        for (Integer integer : integers) {
            System.out.println(integer);
        }
    }
}
;