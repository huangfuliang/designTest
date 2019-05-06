package com.design.pattern.decoration;


import lombok.extern.slf4j.Slf4j;

/**
 * @author: huangfuliang
 * @date: 2019/5/5.
 */
@Slf4j
public class HighScoreDecorator extends Decorator {

    public HighScoreDecorator(SchoolReport sr) {
        super(sr);
    }

    public void reportHighScore() {
        log.info("最高分 75");
    }

    @Override
    public void report() {
        this.reportHighScore();
        super.report();
    }
}
