package com.design.pattern.decoration;

/**
 * @author: huangfuliang
 * @date: 2019/5/5.
 */
public class Decorator extends SchoolReport{

    private SchoolReport sr;

    public Decorator(SchoolReport sr) {
        this.sr = sr;
    }

    @Override
    public void report() {
        this.sr.report();
    }

    @Override
    public void sign(String name) {
        this.sr.sign(name);
    }
}
