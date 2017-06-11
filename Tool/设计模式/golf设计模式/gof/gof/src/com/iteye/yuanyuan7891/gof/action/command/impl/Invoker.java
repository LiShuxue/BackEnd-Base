package com.iteye.yuanyuan7891.gof.action.command.impl;

import com.iteye.yuanyuan7891.gof.action.command.Command;
//Invoker要求该命令执行这个请求。

public class Invoker {

    private Command command;
    
    public void setCommand(Command command) {
        this.command = command;
    }
    
    public void execute() {
        command.execute();
    }
}
