package com.iteye.yuanyuan7891.gof.structure.composite;

import java.util.List;


public class Test {

    public static void main(String[] args) {
        Employer pm = new ProjectManager("项目经理");
        Employer pa = new ProjectAssistant("项目助理");
        Employer programmer1 = new Programmer("程序员一");
        Employer programmer2 = new Programmer("程序员二");
        
        pm.add(pa);//为项目经理添加项目助理
        pm.add(programmer2);//为项目经理添加程序员
        
        List<Employer> ems = pm.getEmployers();
        for (Employer em : ems) {
            System.out.println(em.getName());
        }
    }
}
/*
1.2.3 组合模式

将对象组合成树形结构以表示"部分-整体"的层次结构。"Composite使得用户对单个对象和组合对*的使用具有一致性。"

适用性

1.你想表示对象的部分-整体层次结构。

2.你希望用户忽略组合对象与单个对象的不同，用户将统一地使用组合结构中的所有对象。
		
参与者

1.Component
  为组合中的对象声明接口。
  在适当的情况下，实现所有类共有接口的缺省行为。
  声明一个接口用于访问和管理Component的子组件。
  (可选)在递归结构中定义一个接口，用于访问一个父部件，并在合并的情况下实现它。

2.Leaf
  在组合中表示叶节点对象，叶节点没有子节点。
  在组合中定义节点对象的行为。

3.Composite
  定义有子部件的一些部件的行为。
  存储子部件。
  在Component接口中实现与子部件所有的操作。

4.Client
  通过Component接口操纵组合部件的对象。
*/