package com.gemini.dp.command.order;

/**
 * todo (用一句话描述该文件做什么)
 *
 * @author xiaocuizi
 * @since 0.0.1 2020/5/18 10:07
 */
public class OrderReceiver {
    public Long create(Order order) {
        System.out.println("创建订单");
        return Long.valueOf("455555555");
    }

    public boolean cancel(Long orderId, Long uid) {
        System.out.println("取消订单");
        // push通知
        // 发送短信
        // 通知交易
        return true;
    }

    public boolean delete(Long orderId, Long uid) {
        System.out.println("删除订单");
        return true;
    }


    /**
     * 订单状态的流转
     * @param orderId
     * @param newOrderStatus
     * @param oldOrderStatus
     * @return
     */
    public boolean update(Long orderId, Long newOrderStatus, Long oldOrderStatus) {
        System.out.println("更新订单");
        return true;
    }
}
