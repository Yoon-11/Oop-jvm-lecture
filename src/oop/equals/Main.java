package oop.equals;

import oop.MyString;

public class Main {
    public static void main(String[] args) {
        MyString s1 = new MyString();
        s1.setString("Hello");
        MyString s2 = new MyString();
        s2.setString("Hello");

        System.out.println(s1.equals(s2));
    }
}
