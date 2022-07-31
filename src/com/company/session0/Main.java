package com.company.session0;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String personOne = "Farzana";
        int farzanaAge = 24;
        float farzanaCgpa = 3.41f;
        char farzanaGrade = 'B';
        boolean isFarzanaMarried = false;

        String personTwo = "Hamza";
        int hamzaAge = 27;
        float hamzaCgpa = 2.5f;
        char hamzaGrade = 'C';
        boolean isHamzaMarried = false;

        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

//        if (input.equalsIgnoreCase(personOne)) {
//            System.out.println(personOne + " | " + farzanaAge + " | " + farzanaCgpa + " | " + farzanaGrade + " | " + isFarzanaMarried);
//        } else if (input.equalsIgnoreCase(personTwo)) {
//            System.out.println(personTwo + " | " + hamzaAge + " | " + hamzaCgpa + " | " + hamzaGrade + " | " + isHamzaMarried);
//        } else {
//            System.out.println("Person not available in database");
//        }

        switch (input.toLowerCase(Locale.ROOT))
        {
            case "farzana":
                System.out.println(personOne + " | " + farzanaAge + " | " + farzanaCgpa + " | " + farzanaGrade + " | " + isFarzanaMarried);
                break;
            case "hamza" :
                System.out.println(personTwo + " | " + hamzaAge + " | " + hamzaCgpa + " | " + hamzaGrade + " | " + isHamzaMarried);
                break;

            default:
                System.out.println("Person not available in database");
        }
    }
}
