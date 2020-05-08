package com.gemini.stack;

import java.util.Queue;
import java.util.LinkedList;

public class QueueToStack<T> {

    public static void main(String[] args) {
        QueueToStack<String> stack = new QueueToStack<>();
        stack.push("A");
        stack.push("B");
        stack.push("C");
        System.out.println(stack.pop());
    }

    private Queue<T> queue1;
    private Queue<T> queue2;

    public QueueToStack() {
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