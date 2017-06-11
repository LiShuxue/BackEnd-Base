package com.iteye.yuanyuan7891.gof.action.observer.impl;

import com.iteye.yuanyuan7891.gof.action.observer.Policeman;

public class TianHePoliceman implements Policeman {

    public void action(Citizen ci) {
        String help = ci.getHelp();
        if (help.equals("normal")) {
            System.out.println("一切正常, 不用出动");
        }
        if (help.equals("unnormal")) {
            System.out.println("有犯罪行为, 天河警察出动!");
        }
    }
}
