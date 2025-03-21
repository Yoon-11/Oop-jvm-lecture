package oop.refactoring.level2;

import oop.refactoring.level2.linkedList.MyNode;

public class UserData extends MyNode {
    public UserData(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    String name;
    String phone;


    @Override
    public String getKey() {
        return name;
    }

    @Override
    public void printNode() {
        System.out.println(name + "\t" + phone);
    }
}
