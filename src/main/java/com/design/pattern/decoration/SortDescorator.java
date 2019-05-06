package com.design.pattern.decoration;

import lombok.extern.slf4j.Slf4j;

/**
 * @author: huangfuliang
 * @date: 2019/5/5.
 */
@Slf4j
public class SortDescorator extends Decorator {

    public SortDescorator(SchoolReport sr) {
        super(sr);
    }

    private void reportSort() {
        log.info("第38名");
    }

    @Override
    public void report() {
        this.reportSort();
        super.report();
    }
}
