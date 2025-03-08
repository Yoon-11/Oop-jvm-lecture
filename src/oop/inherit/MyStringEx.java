package oop.inherit;

import oop.MyString;

public class MyStringEx extends MyString {

    @Override
    protected String onSetString(String param) {
        if (param.equals("멍멍이아들")) {
            param = "우리귀요미";
        }
        return param;
    }

    @Override
    public String getString() {
        return super.getString();
    }
}
