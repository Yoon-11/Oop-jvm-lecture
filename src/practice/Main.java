package practice;

public class Main {
    public static void main(String[] args) {
        MyString str = new MyString();
        System.out.println(str.length());
        System.out.println(str.getString());

        str.setString("Hello java");
        System.out.println(str.length());
        System.out.println(str.getString());
        System.out.println(str.compareTo("Hello java"));

        MyString str1 = new MyString("Test");
        System.out.println(str1.getString());
        MyString str2 = new MyString(512);
        System.out.println(str2.getString());

        System.out.println("==============");
        MyString src = new MyString("Hello");
        MyString dst = new MyString(src);

        src.setString("World");
        System.out.println(dst.getString());
    }

}
