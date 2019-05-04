package com.design.pattern.chain.cur;

import com.design.pattern.chain.IWomen;
import lombok.extern.slf4j.Slf4j;

/**
 * @author: huangfuliang
 * @date: 2019/5/3.
 */
@Slf4j
public abstract class Handler {

    final static int FATHER_LEVEL_REQUEST = 1;

    final static int HUSBAND_LEVEL_REQUEST = 2;

    final static int SON_LEVEL_REQUEST = 3;

    private int level = 0;

    private Handler nextHandler;

    public Handler(int level) {
        this.level = level;
    }

    public final void handlerMessage(IWomen women) {
        if (women.getType() == this.level) {
            this.response(women);
        } else {
            if (this.nextHandler != null) {
                this.nextHandler.handlerMessage(women);
            } else {
                log.info("---没地方请示了，按不同意处理---\n");
            }
        }
    }

    public void setNext(Handler handler) {
        this.nextHandler = handler;
    }

    protected abstract void response(IWomen women);


}
