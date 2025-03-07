package oop.inherit;
import oop.MyString;

public class Main {
    public static void main(String[] args) {
        MyString str = new MyStringEx();
        str.setString("멍멍이아들");
        System.out.println(str.getString());
    }
}
