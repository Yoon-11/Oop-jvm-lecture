package oop.level.level1.legacy;

import java.util.Scanner;

class LegacyUserData {
    public LegacyUserData(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    String name;
    String phone;
    LegacyUserData next;
}

public class LegacyMain {
    static LegacyUserData head = new LegacyUserData("Dummy", "Dummy");

    public static LegacyUserData findNode(String name) {
        LegacyUserData tmp = head.next;
        while (tmp != null) {
            if (tmp.name.compareTo(name) == 0) {
                return tmp;
            }
            tmp = tmp.next;
        }
        return null;
    }


    public static boolean addNewNode(String name, String phone){
        if (findNode(name) != null) {
            return false;
        }

        LegacyUserData newUser = new LegacyUserData(name, phone);
        newUser.next = head.next;
        head.next = newUser;

        return true;

    }

    public static void addUser() {
        Scanner s = new Scanner(System.in);
        System.out.println("Name : ");
        String name = s.nextLine();
        System.out.println("Phone : ");
        String phone = s.nextLine();

        addNewNode(name, phone);
    }

    public static void searchUser() {
        Scanner s = new Scanner(System.in);
        System.out.println("name : ");
        String name = s.nextLine();

        LegacyUserData user = findNode(name);
        if (user != null) {
            System.out.println("name = " + user.name);
            System.out.println("phone = " + user.phone);
        }
        else
            System.out.println("Error : Failed to find " + name);

    }

    public static void printAll() {
        LegacyUserData tmp = head.next;
        while (tmp != null) {
            System.out.println(tmp.name + "\t" + tmp.phone);
            tmp = tmp.next;
        }
    }

    public static boolean removeNode(String name) {
        LegacyUserData prev = head;
        LegacyUserData toDelete = null;

        while (prev.next != null) {
            toDelete = prev.next;

            if (toDelete.name.compareTo(name) == 0) {
                prev.next = toDelete.next;
                return true;
            }
            prev = prev.next;
        }
        return false;
    }

    public static void removeUser() {
        Scanner s = new Scanner(System.in);
        System.out.println("Name : ");
        String name = s.nextLine();

        if (removeNode(name)) {
            System.out.println("Removed!");
        }else
            System.out.println("Error : Failed to remove " + name);
    }

    public static int printUi() {
        System.out.println("[1] Add \t [2] Search \t [3] Print All \t [4] Remove \t [0] Exit");
        Scanner s = new Scanner(System.in);
        System.out.println(": ");
        int input = s.nextInt();
        return input;
    }

    public static void main(String[] args) {
        int menu = 0;
        while ((menu = printUi()) != 0) {
            switch (menu){
                case 1:
                    addUser();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;




            }
        }
    }





}
