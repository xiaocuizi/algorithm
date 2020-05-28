package com.gemini.dp.command.order;

/**
 * todo (用一句话描述该文件做什么)
 *
 * @author xiaocuizi
 * @since 0.0.1 2020/5/18 10:48
 */
public class Client {

    public static void main(String[] args) {
        OrderReceiver orderReceiver = new OrderReceiver();
        Order order = new Order();
        order.setOrderId(1L);
        order.setUserName("暖色调");
        order.setUid(443L);

        OrderInvoker orderInvoker = new OrderInvoker();
        orderInvoker.setCommand(new OrderCreateCommand(orderReceiver, order));
        Object action = orderInvoker.action();
        System.out.println(action.toString());


        orderInvoker.setCommand(new OrderCancelCommand(orderReceiver, order));
        Object action2 = orderInvoker.action();
        System.out.println(action2.toString());

    }
}
