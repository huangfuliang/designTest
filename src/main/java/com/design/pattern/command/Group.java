package com.design.pattern.command;

/**
 * @author：huangfuliang
 * @date：2019/5/3.
 *
 * 抽象组类
 */
public abstract class Group {

    /** 寻找到组 */
    public abstract void find();

    /**
     * 要求添加功能
     */
    public abstract void add();

    /**
     * 要求删除功能
     */
    public abstract void delete();

    /**
     * 要求修改功能
     */
    public abstract void change();

    /**
     * 要求给出所有的变更计划
     */
    public abstract void plan();

    public void rollBack() {

    }

}
