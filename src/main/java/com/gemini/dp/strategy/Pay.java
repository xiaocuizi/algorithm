package com.gemini.dp.strategy;

import java.math.BigDecimal;

/**
 * todo (用一句话描述该文件做什么)
 *
 * @author xiaocuizi
 * @since 0.0.1 2020/4/19 19:33
 */
public interface Pay {
    BigDecimal sale(Integer dis,BigDecimal price);
}
