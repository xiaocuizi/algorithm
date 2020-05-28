package com.gemini.dp.command.order;

import com.gemini.dp.command.LightOffCommand;
import com.gemini.dp.command.LightOnCommand;

/**
 * todo (用一句话描述该文件做什么)
 *
 * @author xiaocuizi
 * @since 0.0.1 2020/5/18 10:17
 */
public class OrderCancelCommand  implements OrderCommand{

    private OrderReceiver orderReceiver;
    private Order order;

    public OrderCancelCommand(OrderReceiver orderReceiver, Order order) {
        this.orderReceiver = orderReceiver;
        this.order = order;
    }

    @Override
    public <T> T execute() {
        orderReceiver.cancel(order.getOrderId(), order.getUid());
        return (T) Boolean.TRUE;
    }
}
