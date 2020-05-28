package com.gemini.dp.command.order;

/**
 * todo (用一句话描述该文件做什么)
 *
 * @author xiaocuizi
 * @since 0.0.1 2020/5/18 10:17
 */
public class OrderCreateCommand implements OrderCommand {

    private OrderReceiver orderReceiver;
    private Order order;

    public OrderCreateCommand(OrderReceiver orderReceiver, Order order) {
        this.orderReceiver = orderReceiver;
        this.order = order;
    }

    @Override
    public  <T> T execute() {
       return (T) orderReceiver.create(order);
    }
}
