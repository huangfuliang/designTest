package com.design.pattern.command;

/**
 * @author: huangfuliang
 * @date: 2019/5/3.
 */
public class Invoker {

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void action() {
        this.command.execute();
    }
}
