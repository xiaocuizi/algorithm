package com.gemini.dp.strategy.impl;

import com.gemini.dp.strategy.Pay;
import com.gemini.dp.strategy.PayType;

import java.math.BigDecimal;

/**
 * todo (用一句话描述该文件做什么)
 *
 * @author xiaocuizi
 * @since 0.0.1 2020/4/19 21:27
 */
@PayType(channelId = 2)
public class ABCPay implements Pay {
    @Override
    public BigDecimal sale(Integer dis, BigDecimal price) {
        return BigDecimal.valueOf(dis);
    }
}
