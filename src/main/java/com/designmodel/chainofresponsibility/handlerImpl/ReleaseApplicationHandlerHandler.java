package com.designmodel.chainofresponsibility.handlerImpl;


import com.designmodel.chainofresponsibility.handler.Handler;

public class ReleaseApplicationHandlerHandler extends Handler {
    @Override
    public void handleRequest() {
        System.out.println("活动发布");
    }
}
