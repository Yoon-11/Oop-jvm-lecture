package oop.refactoring.level2.linkedList;

public abstract class MyNode {
    protected MyNode next;

    public MyNode getNext(){
        return next;
    }

    public abstract String getKey();

    public abstract void printNode();

}
