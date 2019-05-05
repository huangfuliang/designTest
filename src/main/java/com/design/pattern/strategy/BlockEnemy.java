package com.design.pattern.strategy;

import lombok.extern.slf4j.Slf4j;

/**
 * @author: huangfuliang
 * @date: 2019/5/4.
 */
@Slf4j
public class BlockEnemy implements IStrategy{
    @Override
    public void operate() {
        log.info("孙夫人断后");
    }
}
