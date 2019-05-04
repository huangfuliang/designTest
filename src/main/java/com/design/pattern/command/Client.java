package com.design.pattern.command;

/**
 * @author: huangfuliang
 * @date: 2019/5/3.
 */
public class Client {
    public static void main(String[] args) {
        Invoker invoker = new Invoker();
        System.out.println("-------客户新增一个需求------");
        // 添加一个需求
        Command command = new AddRequirementCommand();
        invoker.setCommand(command);
        invoker.action();

    }
}
