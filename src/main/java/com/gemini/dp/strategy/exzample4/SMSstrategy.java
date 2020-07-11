package com.gemini.dp.strategy.exzample4;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import javax.annotation.PostConstruct;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * todo (用一句话描述该文件做什么)
 *
 * @author xiaocuizi
 * @since 1.0.0 2020/7/10 9:44
 */
public class SMSstrategy implements ApplicationContextAware {

    private static Map<SmsType, SmsService> serviceMap = new ConcurrentHashMap<>();

    private ApplicationContext applicationContext;

    public SmsService getService(SmsType smsType) {
        return serviceMap.get(smsType);
    }

    @PostConstruct
    public void initSMService() {
        Map<String, SmsService> beansMap = applicationContext.getBeansOfType(SmsService.class);
        beansMap.forEach((String t, SmsService service) -> {
            serviceMap.put(service.smsType(), service);
        });
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
