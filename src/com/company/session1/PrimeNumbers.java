package com.company.session1;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        System.out.println("Please enter a number to check: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        if (isPrime(number))
            System.out.println("It's a prime number");
        else
            System.out.println("It's not a prime number");
    }

    public static boolean isPrime(int number) {
        boolean isPrime = true;

        //Edge case
        if (number <= 1)
            isPrime = false;

        for (int i = 2; i < number; i++) {
            if (number % i == 0)
                isPrime = false;
        }

        return isPrime;
    }

    public static int add(int num1, int num2) {
        return num1 + num2;
    }
}
