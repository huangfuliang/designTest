package com.design.pattern.chain.cur;

import com.design.pattern.chain.IWomen;
import lombok.extern.slf4j.Slf4j;

/**
 * @author: huangfuliang
 * @date: 2019/5/4.
 */
@Slf4j
public class Husband extends Handler {

    Husband() {
        super(HUSBAND_LEVEL_REQUEST);
    }

    @Override
    protected void response(IWomen women) {
        log.info("-----------向丈夫请示----------");
        log.info(women.getRequest());
        log.info("丈夫的答复:同意 ");
    }
}
