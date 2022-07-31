package com.company.session4;

import java.util.Scanner;

public class Arrays2D2 {
    static Scanner input = new Scanner(System.in);
    static Object[][] matrix = new Object[3][3];

    public static void main(String[] args) {
        input();
        output();

    }

    public static void input() {
        print("\n*********** INPUT ***********");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = input.nextInt();
            }
        }
    }

    public static void output() {
        print("\n*********** OUTPUT ***********");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            print("");
        }
    }

    public static void print(String str) {
        System.out.println(str);
    }
}
