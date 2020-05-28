package com.gemini.栈;

import java.util.LinkedList;
import java.util.Queue;

public class 两个队列实现栈<T> {

    public static void main(String[] args) {
        两个队列实现栈<String> stack = new 两个队列实现栈<>();
        stack.push("A");
        stack.push("B");
        stack.push("C");
        System.out.println(stack.pop());
    }

    private Queue<T> queue1;
    private Queue<T> queue2;

    public 两个队列实现栈() {
        this.queue1 = new LinkedList<T>();
        this.queue2 = new LinkedList<T>();
    }

    public boolean push(T element) {
        this.queue1.add(element);
        return true;
    }

    public T pop() {
        if (this.queue1.size() == 1) {
            return this.queue1.poll();
        } else {
            while (this.queue1.size() > 1) {
                this.queue2.add(this.queue1.poll());
            }
            T ans = this.queue1.poll();
            while (this.queue2.size() > 0) {
                this.queue1.add(this.queue2.poll());
            }
            return ans;
        }
    }

    public int size() {
        return this.queue1.size() + this.queue2.size();
    }
}