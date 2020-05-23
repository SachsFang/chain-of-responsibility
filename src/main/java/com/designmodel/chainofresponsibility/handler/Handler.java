package com.designmodel.chainofresponsibility.handler;

public abstract class Handler {
    private Handler nextHandler;

    // 处理当下的请求抽象方法
    public abstract void handleRequest();

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public Handler getNextHandler() {
        return nextHandler;
    }
}
