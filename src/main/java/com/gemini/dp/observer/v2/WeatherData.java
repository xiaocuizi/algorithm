package com.gemini.dp.observer.v2;

import com.gemini.dp.observer.CurrentConditions;

import java.util.ArrayList;

/**
 * 类是核心
 * 1. 包含最新的天气情况信息
 * 2. 含有观察者集合，使用ArrayList管理
 * 3. 当数据有更新时，就主动的调用   CurrentConditions对象update方法(含 display), 这样他们（接入方）就看到最新的信息
 *
 * @author Administrator
 */
public class WeatherData implements Subject {
    private float temperatrue;
    private float pressure;
    private float humidity;
    // 观察者结合
    private ArrayList<Observerv> observervs;
    //加入新的第三方

    public WeatherData() {
        this.observervs = new ArrayList<Observerv>();
    }

    public float getTemperature() {
        return temperatrue;
    }

    public float getPressure() {
        return pressure;
    }

    public float getHumidity() {
        return humidity;
    }


    public void dataChange() {
        //调用 接入方的 update
		notifyv();
    }

    //当数据有更新时，就调用 setData
    public void setData(float temperature, float pressure, float humidity) {
        this.temperatrue = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        //调用dataChange， 将最新的信息 推送给 接入方 currentConditions
        dataChange();
    }

    @Override
    public void register(Observerv observer) {
        observervs.add(observer);
    }

    @Override
    public void remove(Observerv observer) {
        observervs.remove(observer);
    }

    @Override
    public void notifyv() {
        for (Observerv observer : observervs) {
            observer.update(this.temperatrue, this.pressure, this.humidity);
        }

    }
}
