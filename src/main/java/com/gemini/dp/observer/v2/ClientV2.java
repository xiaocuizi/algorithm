package com.gemini.dp.observer.v2;

/**
 * todo (用一句话描述该文件做什么)
 *
 * @author xiaocuizi
 * @since 0.0.1 2020/5/8 10:57
 */
public class ClientV2 {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditions currentConditions = new CurrentConditions();
        BaiduSite baiduSite = new BaiduSite();
        weatherData.register(baiduSite);
        weatherData.register(currentConditions);

        //
        weatherData.remove(currentConditions);
        System.out.println("通知各个注册的观察者.........");
        weatherData.setData(10, 100, 23.3f);
    }
}
