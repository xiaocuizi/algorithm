package com.gemini.dp.observer.v2;

/**
 * todo (用一句话描述该文件做什么)
 *
 * @author xiaocuizi
 * @since 0.0.1 2020/5/8 11:00
 */
public class BaiduSite implements Observerv {


    private float temperature;
    private float pressure;
    private float humidity;


    public void display() {
        System.out.println("***百度网站 mTemperature: " + temperature + "***");
        System.out.println("***百度网站 mPressure: " + pressure + "***");
        System.out.println("***百度网站 mHumidity: " + humidity + "***\n==========================");
    }
    @Override
    public void update(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }
}
