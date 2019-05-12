package com.design.pattern.templateMethod;

import lombok.extern.slf4j.Slf4j;

/**
 * @author: huangfuliang
 * @date: 2019/5/12.
 */
@Slf4j
public class HummerH1Model extends HummerModel {
    @Override
    public void start() {
       log.info("H1 发动...");
    }

    @Override
    public void stop() {
        log.info("H1 停止...");
    }

    @Override
    public void alarm() {
        log.info("H1 鸣笛");
    }

    @Override
    public void engineBoom() {
        log.info("H1 引擎声音");
    }

}
