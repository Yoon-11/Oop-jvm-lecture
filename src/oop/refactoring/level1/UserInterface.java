package oop.refactoring.level1;

import java.util.Scanner;

import static oop.refactoring.level1.MyList.*;

public class UserInterface {
    public void run() {
        int menu = 0;
        while ((menu = printUi()) != 0) {
            switch (menu){
                case 1:
                    addUser();
                    break;
                case 2:
                    searchUser();
                    break;
                case 3:
                    printAll();
                    break;
                case 4:
                    removeUser();
                    break;

            }
        }

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

        UserData user = findNode(name);
        if (user != null) {
            System.out.println("name = " + user.name);
            System.out.println("phone = " + user.phone);
        }
        else
            System.out.println("Error : Failed to find " + name);

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
        System.out.print(": ");
        int input = s.nextInt();
        return input;
    }


}
