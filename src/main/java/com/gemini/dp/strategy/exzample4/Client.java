package com.gemini.dp.strategy.exzample4;

/**
 * todo (用一句话描述该文件做什么)
 *
 * @author xiaocuizi
 * @since 1.0.0 2020/7/10 16:15
 */
public class Client {

    public static void doSend(String[] args) {
        SMSstrategy smSstrateg = new SMSstrategy();
        // 阿里云发送短信
        SmsService aliyunService = smSstrateg.getService(SmsType.ALIYUN);
        aliyunService.send("hello,world");
        // 中国移动发送短信
        SmsService mobileService = smSstrateg.getService(SmsType.MOBILE);
        mobileService.send("hello,world2");
    }
}
