package com.design.pattern.chain.cur;

import com.design.pattern.chain.IWomen;
import lombok.extern.slf4j.Slf4j;

/**
 * @author: huangfuliang
 * @date: 2019/5/4.
 */
@Slf4j
public class Son extends Handler {

    public Son() {
        super(SON_LEVEL_REQUEST);
    }



    @Override
    protected void response(IWomen women) {
        log.info("-----------向儿子请示----------");
        log.info(women.getRequest());
        log.info("儿子的答复:同意 ");
    }
}
