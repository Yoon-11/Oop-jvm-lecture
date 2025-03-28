package oop;

import java.util.Arrays;
import java.util.Objects;

public class MyString {
    private static int count;

    private byte[] string;

    public MyString() {}

    public MyString(MyString rhs) {
        this.deepCopy(rhs);
    }

    private MyString(String str) {
        string = str.getBytes();
    }

    private MyString(int num) {
        String tmp;
        tmp = String.format("%d", num);
        string = tmp.getBytes();
    }


    public static MyString newString(int param) {
        count++;
        return new MyString(param);
    }


    public static MyString newString(String string) {
        count++;
        if (string == null || string.length() <= 0) {
            return new MyString("(null)");
        }
        return new MyString(string);
    }

    public static int getCount() {
        return count;
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
        String result = onSetString(param);
        string = result.getBytes().clone();


    }

    protected String onSetString(String param) {
        return param;
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

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        MyString myString = (MyString) o;
        return Objects.deepEquals(string, myString.string);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(string);
    }

    @Override
    public String toString() {
        return "MyString{" +
                "string=" + Arrays.toString(string) +
                '}';
    }
}