package com.iteye.yuanyuan7891.gof.action.command.impl;

import com.iteye.yuanyuan7891.gof.action.command.Command;
//ConcreteCommand将一个接收者对象绑定于一个动作。
//调用接收者相应的操作，以实现Execute。


public class CommandImpl extends Command {

public CommandImpl(Receiver receiver) {
  super(receiver);
}

public void execute() {
  receiver.receive ();
}
}
