package com.gemini.arrays;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Vector;

import static java.util.Arrays.asList;

/**
 * todo (用一句话描述该文件做什么)
 *
 * @author xiaocuizi
 * @since 1.0.0 2020/7/13 21:14
 */
public class Q7 {

    public static void main(String[] args) {
        List<Integer> values = new ArrayList<>(asList(1, 3, 2));

        remove(values);
    }

    private static void remove(Collection<Integer> values) {
        for (Integer i : values) {
            values.remove(i);
        }

    }
}
