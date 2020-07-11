package com.gemini.dp.strategy.exzample4;

/**
 * todo (用一句话描述该文件做什么)
 *
 * @author xiaocuizi
 * @since 1.0.0 2020/7/10 9:36
 */
public interface SmsService {


    /**
     * 发送短信
     * @param content 短信内容
     */
    void send(String content);

    /**
     * 短信发送通道
     * @return
     */
    public SmsType smsType();
}
