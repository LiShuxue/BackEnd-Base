package com.iteye.yuanyuan7891.gof.action.command;

import com.iteye.yuanyuan7891.gof.action.command.impl.Receiver;
//Command声明执行操作的接口

public abstract class Command {
    
    protected Receiver receiver;
    
    public Command(Receiver receiver) {
        this.receiver = receiver;
    }
    
    public abstract void execute();
}
