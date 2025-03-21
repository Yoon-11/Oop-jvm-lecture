package oop.refactoring.level2.linkedList;


import oop.refactoring.level2.UserData;

public class MyList {
    public MyList(MyNode myNode) {
        head = myNode;
    }

    static MyNode head = new UserData("Dummy", "Dummy");


    public static MyNode findNode(String name) {
        MyNode tmp = head.next;
        while (tmp != null) {
            if (tmp.getKey().compareTo(name) == 0) {
                return tmp;
            }
            tmp = tmp.next;
        }
        return null;
    }


    public static boolean addNewNode(MyNode newNode){
        if (findNode(newNode.getKey()) != null) {
            return false;
        }

        newNode.next = head.next;
        head.next = newNode;

        return true;

    }


    public static void printAll() {
        MyNode tmp = head.next;
        while (tmp != null) {
            tmp.printNode();
            tmp = tmp.next;
        }
    }

    public static boolean removeNode(String name) {
        MyNode prev = head;
        MyNode toDelete = null;

        while (prev.next != null) {
            toDelete = prev.next;

            if (toDelete.getKey().compareTo(name) == 0) {
                prev.next = toDelete.next;
                return true;
            }
            prev = prev.next;
        }
        return false;
    }

}
