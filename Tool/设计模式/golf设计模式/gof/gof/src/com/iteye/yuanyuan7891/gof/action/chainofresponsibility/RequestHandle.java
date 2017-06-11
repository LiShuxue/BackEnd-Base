package com.iteye.yuanyuan7891.gof.action.chainofresponsibility;

import com.iteye.yuanyuan7891.gof.action.chainofresponsibility.impl.Request;

//Handler 

public interface RequestHandle {

    void handleRequest(Request request);
}
