package com.gemini.排序;

import java.util.Comparator;

/**
 * todo (用一句话描述该文件做什么)
 *
 * @author xiaocuizi
 * @since 0.0.1 2020/5/7 21:10
 */
public class BinaryHeap<E> implements Heap {
    private E[] elements;
    private int size;
    private Comparator<E> comparator;
    private static int defaultSize = 10;

    public BinaryHeap(Comparator<E> comparator) {
        this.comparator = comparator;
        this.elements = (E[]) new Object[defaultSize];
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return (this.size == 0);
    }

    @Override
    public void clear() {
        for (int i = 0; i < size; i++) {
            elements[i] = null;
        }
        size = 0;
    }

    @Override
    public void add(Object o) {
        this.elements[size++] = (E) o;
    }

    @Override
    public Object get() {
        emptyCheck();
        return this.elements[0];
    }

    @Override
    public void remove() {

    }

    @Override
    public void replace(Object o) {

    }

    public int compare(E e1, E e2) {
        return this.comparator == null ? comparator.compare(e1, e2) :
                ((Comparable<E>) e1).compareTo(e2);
    }

    private void emptyCheck() {
        if (size == 0) {
            throw new IndexOutOfBoundsException("超出范围");
        }
    }
}
