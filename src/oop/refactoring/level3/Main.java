package oop.refactoring.level3;

import oop.refactoring.level3.linkedList.MyList;
import oop.refactoring.level3.linkedList.MyNode;

class UserData extends MyNode {
    private String name;
    private String phone;

    UserData(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() { return name; }
    public String getPhone() { return phone; }

    @Override
    public String getKey() {
        return name;
    }

    @Override
    public void printNode() {
        System.out.println(name + "\t" + phone);
    }

    @Override
    public UserData getNode() {
        return new UserData(this.name, this.phone);
    };
}

class MyListEx extends MyList {
    MyListEx(UserData dummyHead) {
        super(dummyHead);
    }

    @Override
    public void onRemoveNode(MyNode node) {
        UserData user = (UserData)node;
        System.out.print("MyListEx.onRemoveNode(");
        System.out.println(node.getKey() + ")");
    }
}

public class Main {
    public static void main(String[] args) {
        MyListEx db = new MyListEx(new UserData("Dummy", "Dummy"));
        UserInterface ui = new UserInterface(db);
        ui.run();
    }
}
