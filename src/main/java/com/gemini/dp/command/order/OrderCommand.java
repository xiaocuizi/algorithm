package com.gemini.dp.command.order;

import org.springframework.data.redis.core.RedisCallback;

/**
 * 订单的行为
 * 订单创建
 * 订单删除
 * 订单取消
 * 订单的修改
 *
 * @author xiaocuizi
 * @since 0.0.1 2020/5/18 10:02
 */
public interface OrderCommand {
    /**
     * 执行
     * @param <T>
     * @return
     */
    <T> T execute();
}
