package com.gemini.排序;

/**
 * 数据结构 -堆
 *
 * @author xiaocuizi
 * @since 0.0.1 2020/5/7 21:04
 */
public interface Heap<E> {
    public int size();

    public boolean isEmpty();

    public void clear();

    public E get();

    public void add(E e);

    public void remove();

    public void replace(E e);
}
