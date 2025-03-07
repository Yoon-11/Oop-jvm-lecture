package oop.practice;

public class MyTest {
    private int data;

    public void setData(int param) {
        this.data = param;
    }

    public int getData() {
        return this.data;
    }

    public static void printData(MyTest param) {
        System.out.println(param.data);
    }

    public static void main(String[] args) {
        MyTest t = new MyTest();
        t.setData(100);
        MyTest.printData(t);
    }
}


