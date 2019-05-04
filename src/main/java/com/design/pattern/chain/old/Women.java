package com.design.pattern.chain.old;

import com.design.pattern.chain.IWomen;

/**
 * @author: huangfuliang
 * @date: 2019/5/3.
 */
public class Women implements IWomen {

    private int type = 0;

    private String request = "";

    public Women(int type, String request) {
        this.type = type;
        this.request = request;
    }

    @Override
    public int getType() {
        return this.type;
    }

    @Override
    public String getRequest() {
        return this.request;
    }
}
