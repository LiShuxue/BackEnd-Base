package com.iteye.yuanyuan7891.gof.action.interpreter;


public class SimpleExpression extends Expression {

    void interpret(Context ctx) {
        System.out.println("这是普通解析器!");
    }
}