package com.gemini.dp.command;

/**
 * todo (用一句话描述该文件做什么)
 * 空命令也是一种设计模式，省去了我们判断空
 * 命令模式经典应用场景：
 *  界面的一个按钮都是一条命令、
 *  模拟单CMD(DOS命令)
 *  订单的撤销、恢复
 *  触发-反馈机制
 *
 * @author xiaocuizi
 * @since 0.0.1 2020/5/18 9:10
 */
public interface Command {
    /**
     * 执行方法
     */
    void execute();

    /**
     * 撤销方法
     */
    void undo();
}
