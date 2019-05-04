package com.design.pattern.chain.old;

import com.design.pattern.chain.IWomen;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author: huangfuliang
 * @date: 2019/5/3.
 */
@Slf4j
public class Client {

    public static void main(String[] args) {
        IHandler son = new Son();
        IHandler father = new Father();
        IHandler husband = new Husband();

        Random random = new Random();
        List<IWomen> list = new ArrayList<IWomen>();
        for (int i = 0; i < 10; i++) {
            list.add(new Women(random.nextInt(4), "我要出去逛街"));
        }
        list.stream().forEach(women -> {
            if (women.getType() == 1) {
                log.info("\n-----向父亲请示------");
                father.handlerMessage(women);
            } else if (women.getType() == 2) {
                log.info("\n-----向丈夫请示------");
                husband.handlerMessage(women);
            } else if (women.getType() == 3) {
                log.info("\n-----向儿子请示------");
                son.handlerMessage(women);
            } else {
                log.error("bad type!");
            }
        });
    }
}
