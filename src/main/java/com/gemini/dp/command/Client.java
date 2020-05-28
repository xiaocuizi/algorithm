package com.gemini.dp.command;

import java.rmi.Remote;

/**
 * todo (用一句话描述该文件做什么)
 *
 * @author xiaocuizi
 * @since 0.0.1 2020/5/18 9:29
 */
public class Client {

    public static void main(String[] args) {

        // 使用命令模式，完成通过遥控器，对电灯的操作

        // 接收者
        LightReceiver lightReceiver = new LightReceiver();
        LightOnCommand lightOnCommand = new LightOnCommand(lightReceiver);
        LightOffCommand lightOffCommand = new LightOffCommand(lightReceiver);

        RemoteController remoteController = new RemoteController();

        // 设置遥控器的命令,比如 no = 0 ,是电灯的操作
        remoteController.setCommand(0,lightOnCommand,lightOffCommand);

        // 开灯
        remoteController.onButtonWsPushed(0);
        // 关灯
        remoteController.offButtonWsPushed(0);

        remoteController.undoButtonWasPushed();
    }
}
