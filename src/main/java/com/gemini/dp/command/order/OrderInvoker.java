package com.gemini.dp.command.order;

/**
 * todo (用一句话描述该文件做什么)
 *
 * @author xiaocuizi
 * @since 0.0.1 2020/5/18 13:05
 */
public class OrderInvoker {
    private OrderCommand command;

    public void setCommand(OrderCommand command) {
        this.command = command;
    }

    public <T>T action() {
       return this.command.execute();
    }
}
