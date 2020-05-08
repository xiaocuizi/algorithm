package com.gemini;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * todo (用一句话描述该文件做什么)
 *
 * @author xiaocuizi
 * @since 0.0.1 2020/5/7 19:01
 */
public class Times {
    private static final SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss.SSS");

    public interface Task {
        void execute();
    }

    public static void test(String title, Task task) {
        if (task == null) {
            return;
        }
        System.out.println((title == null ? "" : ("【" + title + "】\n")) + "开始:" + sdf.format(new Date()));
        long start = System.currentTimeMillis();
        task.execute();
        long end = System.currentTimeMillis();
        double dur = (end - start) / 1000.0;
        System.out.println("结束:" + sdf.format(new Date()) + "\n    耗时：" + dur + "秒\n----------------------------------");
    }
}
