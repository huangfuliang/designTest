package com.design.pattern.command;

/**
 * @author: huangfuliang
 * @date: 2019/5/3.
 * 编码组
 */
public class CodeGroup extends Group{
    public void find() {
        System.out.println("找到编码组");
    }

    public void add() {
        System.out.println("增加一个功能");
    }

    public void delete() {
        System.out.println("删除一个功能");
    }

    public void change() {
        System.out.println("改变一个功能");
    }

    public void plan() {
        System.out.println("代码变更计划");
    }
}
