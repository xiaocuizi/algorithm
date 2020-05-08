package com.gemini.排序;

/**
 * todo (用一句话描述该文件做什么)
 *
 * @author xiaocuizi
 * @since 0.0.1 2020/5/7 20:13
 */
public abstract class Sort {
    private volatile int cmpCount;
    private volatile int swapCount;
    protected Integer[] arr;

    public void sort(Integer[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        this.arr = arr;
        sort();
    }

    protected abstract void sort();

    /**
     * 返回值 0  arr[i1] == arr[i2]
     * 返回值 <0  arr[i1] < arr[i2]
     * 返回值 >0  arr[i1] > arr[i2]
     *
     * @param i1
     * @param i2
     * @return
     */
    protected int cmp(int i1, int i2) {
        cmpCount++;
        return arr[i1] - arr[i2];
    }


    /**
     * 元素交换
     * @param i1
     * @param i2
     */
    protected void swap(int i1, int i2) {
        swapCount++;
        int temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = temp;
    }
}
