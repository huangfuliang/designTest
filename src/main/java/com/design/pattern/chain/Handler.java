package com.design.pattern.chain;

import java.util.Objects;

/**
 * @author: huangfuliang
 * @date: 2019/5/4.
 */
public abstract class Handler {

    private Handler nextHandler;

    /**
     * 每一个处理者都必须对请求作出处理
     * @param request
     * @return
     */
    public final Response handlerMessage(Request request) {
        Response response = null;
        // 判断是否是自己处理的级别
        if (this.getHandlerLevel().equals(request.getRequestLevel())) {
            response = this.ehco(request);
        } else {
            if (Objects.nonNull(nextHandler)) {
                response = this.nextHandler.handlerMessage(request);
            } else {
                // 没有合适的处理者
            }
        }
        return response;
    }


    public void setNextHandler(Handler handler) {
        this.nextHandler = handler;
    }

    /**
     * 每一个处理者都有一个处理级别
     * @return
     */
    public abstract Level getHandlerLevel();

    /**
     * 每一个处理者必须实现的处理实现
     * @param request
     * @return
     */
    public abstract Response ehco(Request request);


}
