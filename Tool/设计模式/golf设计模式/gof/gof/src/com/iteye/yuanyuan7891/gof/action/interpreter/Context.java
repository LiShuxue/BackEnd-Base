package com.iteye.yuanyuan7891.gof.action.interpreter;

import java.util.ArrayList;
import java.util.List;


public class Context {

    private String content;
    
    private List<Expression> list = new ArrayList();
    
    public void setContent(String content) {
        this.content = content;
    }
    
    public String getContent() {
        return this.content;
    }
    
    public void add(Expression eps) {
        list.add(eps);
    }
    
    public List<Expression> getList() {
        return list;
    }
}
