package com.design.pattern.chain.cur;

import com.design.pattern.chain.IWomen;

/**
 * @author: huangfuliang
 * @date: 2019/5/4.
 */
public class Women implements IWomen{

    /**
     * 1---未出嫁
     * 2---出嫁
     * 3---丧夫
     */
    private int type = 0;

    private String request = "";

    public Women(int type, String request) {
        this.type = type;
        this.request = request;
    }

    @Override
    public int getType(){
        return this.type;
    }

    @Override
    public String getRequest() {
        return this.request;
    }



}
