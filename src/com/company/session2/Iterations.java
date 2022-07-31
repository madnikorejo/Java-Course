package com.company.session2;

import java.util.Scanner;

public class Iterations {
    public static void main(String[] args) {
        doWhileLoopDemo();
    }

    public static void doWhileLoopDemo() {
        Scanner input = new Scanner(System.in);
        String userChoice = "";

        do {
            System.out.println(
                    "****** Java Sessions ****** \n" +
                            "1. Resources \n" +
                            "2. Exercises \n" +
                            "3. Videos \n" +
                            "0. Exit \n");

            System.out.println("Do you want to run again? [y/n]");
            userChoice = input.next();
        } while (userChoice.equals("y"));
    }

    public static void whileLoopDemo2() {
        System.out.println("Do you want to run again? [y/n]");
        Scanner input = new Scanner(System.in);
        String userChoice = input.next();

        while (userChoice.equals("y")) {
            System.out.println("User chose to run again");

            System.out.println("Do you want to run again? [y/n]");
            userChoice = input.next();
        }
    }

    public static void whileLoopDemo() {
        String name = "ayesha";
        // while loop : unknown no of iterations
        int counter = 0;
        while (counter < name.length()) {
            System.out.println("Ayesha -> " + (counter + 1));
            counter = counter + 1;
        }
    }

}


