package com.iteye.yuanyuan7891.gof.action.chainofresponsibility.impl;


import com.iteye.yuanyuan7891.gof.action.chainofresponsibility.RequestHandle;
//ConcreteHandler 

public class HRRequestHandle implements RequestHandle {

    public void handleRequest(Request request) {
        if (request instanceof DimissionRequest) {
            System.out.println("要离职, 人事审批!");
        } 
        System.out.println("请求完成");
    }
}
