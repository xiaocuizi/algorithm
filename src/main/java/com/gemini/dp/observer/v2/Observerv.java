package com.gemini.dp.observer.v2;

/**
 * 观察者接口
 *
 * @author xiaocuizi
 * @since 0.0.1 2020/5/8 10:44
 */
public interface Observerv {
    public void update(float temperatrue,float pressure,float humidity);
}
