package com.gemini.dp.strategy.exzample4;

/**
 * todo (用一句话描述该文件做什么)
 *
 * @author xiaocuizi
 * @since 1.0.0 2020/7/10 9:41
 */
public class AliyunSmsService implements SmsService {
    @Override
    public void send(String content) {

        System.out.println("阿里云发送短信。。。。。。。。。");
    }

    @Override
    public SmsType smsType() {
        return SmsType.ALIYUN;
    }
}
