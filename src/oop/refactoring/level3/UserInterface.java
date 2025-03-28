package oop.refactoring.level3;


import oop.refactoring.level3.linkedList.MyIterator;
import oop.refactoring.level3.linkedList.MyList;

import java.util.Scanner;

public class UserInterface {
    MyList list;
    UserInterface(MyList list) {
        this.list = list;
    }

    public int printUi() {
        System.out.println("[1] Add\t[2] Search\t[3] Print all\t[4] Remove\t[0] Exit");
        Scanner s = new Scanner(System.in);
        System.out.print(": ");
        int input = s.nextInt();
        return input;
    }

    public void addUser() {
        Scanner s = new Scanner(System.in);
        System.out.print("Name: ");
        String name = s.nextLine();
        System.out.print("Phone: ");
        String phone = s.nextLine();

        list.addNewNode(new UserData(name, phone));
    }

    public void searchUser() {
        Scanner s = new Scanner(System.in);
        System.out.print("Name: ");
        String name = s.nextLine();

        UserData user = (UserData)list.findNode(name);
        if(user != null) {
            System.out.println("Name: " + user.getName());
            System.out.println("Phone: " + user.getPhone());
        }
        else
            System.out.println("Error: Failed to find " + name);
    }

    public void removeUser() {
        Scanner s = new Scanner(System.in);
        System.out.print("Name: ");
        String name = s.nextLine();

        if(list.removeNode(name))
            System.out.println("Removed!");
        else
            System.out.println("Error: Failed to remove " + name);
    }

    public void printAll() {
        MyIterator it = list.makeIterator();
        UserData currentNode;
        while((currentNode = (UserData)it.getCurrent()) != null) {
            currentNode.printNode();
            it.moveNext();
        }
    }

    public int run() {
        int menu = 0;
        while((menu = printUi()) != 0) {
            switch (menu) {
                case 1:
                    addUser();
                    break;

                case 2:
                    searchUser();
                    break;

                case 3:
                    //list.printAll()
                    printAll();
                    break;

                case 4:
                    removeUser();
                    break;
            }
        }

        return menu;
    }
}