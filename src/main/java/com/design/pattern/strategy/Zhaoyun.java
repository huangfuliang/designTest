package com.design.pattern.strategy;

import lombok.extern.slf4j.Slf4j;

/**
 * @author: huangfuliang
 * @date: 2019/5/4.
 */
@Slf4j
public class Zhaoyun {

    public static void main(String[] args) {
        Context context = null;

        log.info("------第一个锦囊------");
        context = new Context(new BackDoor());
        context.operate();

        log.info("------第二个锦囊------");
        context = new Context(new GivenGreenLight());
        context.operate();

        log.info("------第三个锦囊------");
        context = new Context(new BlockEnemy());
        context.operate();

    }

}
