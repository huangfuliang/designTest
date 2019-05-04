package com.design.pattern.command;

/**
 * @author: huangfuliang
 * @date: 2019/5/3.
 */
public class PageGroup extends Group {
    public void find() {
        System.out.println("找到美工组");
    }

    public void add() {
        System.out.println("客户要求增加一个页面");
    }

    public void delete() {
        System.out.println("客户要求删除一个页面");
    }

    public void change() {
        System.out.println("客户要求修改一个页面");
    }

    public void plan() {
        System.out.println("客户要求页面变更计划");
    }
}
