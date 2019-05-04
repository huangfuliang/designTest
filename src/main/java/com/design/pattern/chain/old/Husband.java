package com.design.pattern.chain.old;

import com.design.pattern.chain.IWomen;
import lombok.extern.slf4j.Slf4j;

/**
 * @author: huangfuliang
 * @date: 2019/5/3.
 */
@Slf4j
public class Husband implements IHandler {

    @Override
    public void handlerMessage(IWomen women) {
        log.info("妻子的请求是：{} ", women.getRequest());
        log.info("丈夫的答案是：同意");
    }
}
