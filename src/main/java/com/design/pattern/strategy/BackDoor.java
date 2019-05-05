package com.design.pattern.strategy;

import lombok.extern.slf4j.Slf4j;

/**
 * @author: huangfuliang
 * @date: 2019/5/4.
 */
@Slf4j
public class BackDoor implements IStrategy{

    @Override
    public void operate() {
        log.info("找乔老帮忙，让吴国给孙权施加压力");
    }
}
