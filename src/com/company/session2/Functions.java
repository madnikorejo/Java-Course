package com.company.session2;

import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        print("Please Enter 2 numbers to add : ");
        int n1 = input.nextInt();
        int n2 = input.nextInt();

        print("Sum of " + n1 + " + " + n2 + " = " + add(n1, n2));
    }

    //Access Modifiers
    //public : accessible everywhere
    //private : accessible only within the class it is written in
    //default : accessible within the package
    //protected : accessible to sub-classes/funtions

    //Static : Functions.add();
    //calling function should be static too

    public static int add(int num1, int num2) {
        int sum = num1 + num2;

        return sum;
    }

    public static void print(String stringToPrint) {
         System.out.println(stringToPrint);
    }
    //Testing Git
}
