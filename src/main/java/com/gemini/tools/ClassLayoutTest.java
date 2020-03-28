package com.gemini.tools;

import com.gemini.array.merge.TwoSortedMerge;
import org.openjdk.jol.info.ClassLayout;

/**
 * todo (用一句话描述该文件做什么)
 *
 * @author xiaocuizi
 * @since 0.0.1 2020/3/28 10:39
 */
public class ClassLayoutTest {

    public static void main(String[] args) {
        TwoSortedMerge obj = new TwoSortedMerge();
        System.out.println(ClassLayout.parseInstance(obj).toPrintable());
    }
}
