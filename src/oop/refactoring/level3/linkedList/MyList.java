package oop.refactoring.level3.linkedList;

public class MyList {
    MyNode head;
    public MyList(MyNode dummyHead) {
        head = dummyHead;
    }

    public boolean addNewNode(MyNode newNode) {
        if(findNode(newNode.getKey()) != null)
            return false;

        if(onAddNewNode(newNode)) {
            newNode.next = head.next;
            head.next = newNode;
            return true;
        }

        return false;
    }

    protected boolean onAddNewNode(MyNode newNode) {
        return true;
    }

    public MyNode findNode(String key) {
        MyNode tmp = head.next;
        while(tmp != null) {
            if(tmp.getKey().compareTo(key) == 0)
                return tmp;

            tmp = tmp.next;
        }

        return null;
    }

    /*    public void printAll() {
            MyNode tmp = head.next;
            while(tmp != null) {
                tmp.printNode();
                tmp = tmp.next;
            }
        }
    */
    public MyIterator makeIterator() {
        MyIterator it = new MyIterator();
        it.head = head.next;
        it.current = head.next;

        return it;
    }

    public boolean removeNode(String name) {
        MyNode prev = head;
        MyNode toDelete = null;

        while(prev.next != null) {
            toDelete = prev.next;
            if(toDelete.getKey().compareTo(name) == 0) {
                onRemoveNode(toDelete);
                prev.next = toDelete.next;
                return true;
            }
            prev = prev.next;
        }

        return false;
    }

    public void onRemoveNode(MyNode node) { }
}
