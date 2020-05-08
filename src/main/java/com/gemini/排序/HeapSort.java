package com.gemini.排序;

/**
 * todo (用一句话描述该文件做什么)
 *
 * @author xiaocuizi
 * @since 0.0.1 2020/5/7 20:16
 */
public class HeapSort extends Sort {
    private int heapSize;

    @Override
    protected void sort() {
        while (heapSize > 1) {
            // 交换对顶元素到尾部元素
            swap(0, heapSize - 1);
            heapSize--;
            // 恢复堆的性质
           // siftDown(0)
        }
    }
}
