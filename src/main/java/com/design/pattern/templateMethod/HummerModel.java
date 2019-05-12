package com.design.pattern.templateMethod;

/**
 * @author: huangfuliang
 * @date: 2019/5/12.
 */
public abstract class HummerModel {

    public abstract void start();

    public abstract void stop();

    public abstract void alarm();

    public abstract void engineBoom();

    public final void run() {
        this.start();

        this.engineBoom();

        if (this.isAlarm()) {
            this.alarm();
        }

        this.stop();
    }

    /**
     * 钩子方法
     * @return
     */
    protected boolean isAlarm() {
        return true;
    }
}
