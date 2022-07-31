package com.company.session5;

import java.util.Scanner;

public class Arrays2DSearching {
    static Scanner input = new Scanner(System.in);
    static Object[][] students = {{1, "Sajid", "CS"}, {2675, "Abdul", "SE"}, {3, "Faizan", "IT"}};

    public static void main(String[] args) {
        print("Please enter Id to search: ");
        int idToSearch = input.nextInt();
        if (searchById(idToSearch) > -1) {
            print("Student with Id -> " + idToSearch + " is found!");
        } else {
            print("No record found");
        }
    }

    public static int searchById(int id) {
        int result = -1;
        for (int i = 0; i < students.length; i++) {
            if (students[i][0].equals(id)) {
                result = i;
                break;
            }
        }
        return result;
    }

    public static void print(String str) {
        System.out.println(str);
    }
}
