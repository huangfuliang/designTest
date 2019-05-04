package com.design.pattern.chain.cur;

import com.design.pattern.chain.IWomen;
import lombok.extern.slf4j.Slf4j;

/**
 * @author: huangfuliang
 * @date: 2019/5/3.
 */
@Slf4j
public class Father extends Handler {

    public Father() {
        super(FATHER_LEVEL_REQUEST);
    }

    @Override
    protected void response(IWomen women) {
        log.info("-----------向父亲请示----------");
        log.info(women.getRequest());
        log.info("父亲的答复:同意 ");
    }
}
