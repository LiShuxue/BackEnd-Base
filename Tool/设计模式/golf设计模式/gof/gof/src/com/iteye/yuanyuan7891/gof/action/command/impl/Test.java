package com.iteye.yuanyuan7891.gof.action.command.impl;

import com.iteye.yuanyuan7891.gof.action.command.Command;

public class Test {

    public static void main(String[] args) {
        Receiver rec = new Receiver();
        Command cmd = new CommandImpl(rec);
        Invoker i = new Invoker();
        i.setCommand(cmd);
        i.execute();
    }
}
