package com.designmodel.chainofresponsibility;

import com.designmodel.chainofresponsibility.handler.Handler;
import com.designmodel.chainofresponsibility.handlerImpl.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ChainOfResponsibilityApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChainOfResponsibilityApplication.class, args);
        Handler activityApplicationHandler = new ActivityApplicationHandler();
        Handler firstLevelAuditHandler = new FirstLevelAuditHandler();
        Handler secondLevelAuditHandler = new SecondLevelAuditHandler();
        Handler thirdLevelAuditHandler = new ThirdLevelAuditHandler();
        Handler releaseApplicationHandlerHandler = new ReleaseApplicationHandlerHandler();

        activityApplicationHandler.setNextHandler(firstLevelAuditHandler);
        firstLevelAuditHandler.setNextHandler(secondLevelAuditHandler);
        secondLevelAuditHandler.setNextHandler(thirdLevelAuditHandler);
        thirdLevelAuditHandler.setNextHandler(releaseApplicationHandlerHandler);

        /*活动提交*/
        activityApplicationHandler.handleRequest();
    }

}
