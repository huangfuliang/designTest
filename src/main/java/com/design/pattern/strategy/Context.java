package com.design.pattern.strategy;

/**
 * @author: huangfuliang
 * @date: 2019/5/4.
 */
public class Context {

    private IStrategy iStrategy;

    public Context(IStrategy iStrategy) {
        this.iStrategy = iStrategy;
    }

    public void operate() {
        this.iStrategy.operate();
    }

}
