package com.designmodel.chainofresponsibility.handlerImpl;

import com.designmodel.chainofresponsibility.handler.Handler;

public class ActivityApplicationHandler extends Handler {

    @Override
    public void handleRequest() {
        System.out.println("活动申请提交");
        getNextHandler().handleRequest();
    }
}
