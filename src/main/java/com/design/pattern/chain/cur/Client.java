package com.design.pattern.chain.cur;

import com.design.pattern.chain.IWomen;
import com.design.pattern.chain.cur.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author: huangfuliang
 * @date: 2019/5/4.
 */
public class Client {

    public static void main(String[] args) {
        Handler son = new Son();
        Handler father = new Father();
        Handler husband = new Husband();

        Random random = new Random();
        List<IWomen> list = new ArrayList<IWomen>();
        for (int i = 0; i < 10; i++) {
            list.add(new Women(random.nextInt(4), "我要出去逛街"));
        }

        // 设置顺序
        father.setNext(husband);
        husband.setNext(son);

        list.stream().forEach(women -> {
            father.handlerMessage(women);
        });
    }
}
