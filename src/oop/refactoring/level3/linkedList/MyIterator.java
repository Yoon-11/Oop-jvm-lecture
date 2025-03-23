package oop.refactoring.level3.linkedList;

public class MyIterator {
    protected MyNode head = null;
    protected MyNode current = null;
    public MyIterator() {}

    public MyNode getCurrent() {
        if(current == null)
            return null;

        return current.getNode();
    }

    public void moveNext() {
        if(current != null)
            current = current.next;
    }
}
