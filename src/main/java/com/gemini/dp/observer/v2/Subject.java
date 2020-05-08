package com.gemini.dp.observer.v2;


import java.util.Observer;

/**
 * todo (用一句话描述该文件做什么)
 *
 * @author xiaocuizi
 * @since 0.0.1 2020/5/8 10:42
 */
public interface Subject {
    void register(Observerv observer);
    void remove(Observerv observer);
    void notifyv();
}
