package com.company.session4;

import java.util.Scanner;

public class Arrays2D {
    static Scanner input = new Scanner(System.in);
    // 0 -> id, 1 -> name, 2 -> department
    static Object[][] students = new Object[2][3];

    public static void main(String[] args) {
        input();
        output();

    }

    public static void input() {
        print("\n*********** INPUT ***********");
        for (int i = 0; i < students.length; i++) {
            print("Enter your id : ");
            students[i][0] = input.nextInt();
            print("Enter your name : ");
            input.nextLine();
            students[i][1] = input.nextLine();
            print("Enter your department : ");
            students[i][2] = input.nextLine();
            print("");
        }
    }

    public static void output() {
        print("\n*********** OUTPUT ***********");
        for (int i = 0; i < students.length; i++) {
            print("ID : " + students[i][0]);
            print("Name : " + students[i][1]);
            print("Department : " + students[i][2]);
            print("");
        }
    }

    public static void print(String str) {
        System.out.println(str);
    }
}
