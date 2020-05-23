package com.designmodel.chainofresponsibility.handlerImpl;

import com.designmodel.chainofresponsibility.handler.Handler;

public class ThirdLevelAuditHandler extends Handler {
    @Override
    public void handleRequest() {
        System.out.println("---三级审核开始");
        int result = (int)(Math.random()*10);
        if(result < 7){
            System.out.println("---三级审核通过");
            getNextHandler().handleRequest();
        }
        else{
            System.out.println("---三级审核不通过");
        }
    }
}
