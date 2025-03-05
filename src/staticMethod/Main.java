package staticMethod;


public class Main {
    public static void main(String[] args) {
        MyString s1 = MyString.newString(10);
        MyString s2 = MyString.newString("Test");

        System.out.println(s1.getString());
        System.out.println(s2.getString());
        System.out.println(MyString.getCount());
    }
}
