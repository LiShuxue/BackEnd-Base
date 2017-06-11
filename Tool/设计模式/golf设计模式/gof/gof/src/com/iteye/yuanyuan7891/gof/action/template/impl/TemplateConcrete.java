package com.iteye.yuanyuan7891.gof.action.template.impl;

import com.iteye.yuanyuan7891.gof.action.template.Template;

public class TemplateConcrete extends Template {

    @Override
    public void print() {
        System.out.println("这是子类的实现");
    }
}