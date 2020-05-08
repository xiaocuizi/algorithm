package com.gemini.stack;

import java.util.Stack;

/**
 * https://www.jianshu.com/p/66617a72ba41
 * @param <T>
 */
public class StackToQueue<T> {
    private Stack<T> stack1;
    private Stack<T> stack2;
    
    public StackToQueue(){
        this.stack1 = new Stack<T>();
        this.stack2 = new Stack<T>();
    }
    public T get() {
        if(this.stack2.size() != 0) {
            return this.stack2.pop();
        }else {
            while(this.stack1.size() != 0) {
                this.stack2.push(this.stack1.pop());
            }
            return this.stack2.pop();
        }
    }
    
    public boolean add(T element) {
        this.stack1.push(element);
        return true;
    }
    public int size() {
        return this.stack1.size() + this.stack2.size();
    }
    
}   