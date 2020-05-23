package com.designmodel.chainofresponsibility.handlerImpl;

import com.designmodel.chainofresponsibility.handler.Handler;

public class FirstLevelAuditHandler extends Handler {
    @Override
    public void handleRequest() {
        System.out.println("-一级审核开始");
        int result = (int)(Math.random()*10);
        if(result < 9){
            System.out.println("-一级审核通过");
            getNextHandler().handleRequest();
        }
        else{
            System.out.println("-一级审核不通过");
        }
    }
}
