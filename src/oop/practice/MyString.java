package oop.practice;

public class MyString {
    private byte[] string;

    public MyString() {}

    public MyString(MyString rhs) {
        this.deepCopy(rhs);
    }

    public MyString(String str) {
        string = str.getBytes();
    }

    public MyString(int num) {
        String tmp;
        tmp = String.format("%d", num);
        string = tmp.getBytes();
    }

    public void deepCopy(MyString rhs) {

        this.string = rhs.string.clone();
    }

    public String getString() {
        if (string == null || string.length == 0) {
            return "(null)";
        }
        return new String(string);
    }

    public void setString(String param) {
        string = param.getBytes();
    }

    public int length() {
        if (string == null) {
            return 0;
        }
        return string.length;
    }

    public int compareTo(String param) {
        if (string == null) {
            return -1;
        }
        String str = new String(string);
        return param.compareTo(str);
    }
}
