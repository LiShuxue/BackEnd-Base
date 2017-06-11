package com.iteye.yuanyuan7891.gof.structure.composite;

import java.util.ArrayList;
//Composite 

public class ProjectManager extends Employer {
    
    public ProjectManager(String name) {
        setName(name);
        employers = new ArrayList();
    }
    
    public void add(Employer employer) {
        employers.add(employer);
    }

    public void delete(Employer employer) {
        employers.remove(employer);
    }
}
