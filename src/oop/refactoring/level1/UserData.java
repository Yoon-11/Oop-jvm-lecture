package oop.refactoring.level1;

public class UserData {
    public UserData(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    String name;
    String phone;
    UserData next;
}
