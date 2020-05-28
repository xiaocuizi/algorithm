package com.gemini.dp.command;

/**
 * todo (用一句话描述该文件做什么)
 *  没有任何命令，空执行，用于初始化每个按钮
 *  其实，这样也是一种设计模式，可以省掉对空的判断
 * @author xiaocuizi
 * @since 0.0.1 2020/5/18 9:16
 */
public class NoCommand implements Command {
    @Override
    public void execute() {

    }

    @Override
    public void undo() {

    }
}
