package com.company.session3;

import java.util.Scanner;

public class Arrays {
    static Scanner input = new Scanner(System.in);
    public static int[] staticAges = {18, 21, 25, 28, 30};
    static Object[] dynamicAges = new Object[5];

    public static void main(String[] args) {
        System.out.println("Please enter age to search: ");
        int ageToFind = input.nextInt();

        int result = search(ageToFind);
        if (result > -1) {
            System.out.println(ageToFind + " found at index " + result);
        } else {
            System.out.println(ageToFind + " Age not found");
        }
    }

    public static int search(int numberToSearch) {
        int index = -1;
        for (int i = 0; i < staticAges.length; i++) {
            if (staticAges[i] == numberToSearch) {
                index = i;
                break;
            }
        }

        return index;
    }

    public static void singleDDynamicArray() {
        System.out.println("Enter ages to insert to array: ");
        for (int i = 0; i < dynamicAges.length; i++) {
            dynamicAges[i] = input.next();
        }

        System.out.println("\nValues entered in array are: ");
        for (int i = 0; i < dynamicAges.length; i++) {
            System.out.println(dynamicAges[i]);
        }
    }

    public static void singleDArrayEnhancedLoop() {
        for (int age : staticAges) {
            System.out.println(age);
        }
    }

    public static void singleDArrayLoop() {
        for (int i = 0; i < staticAges.length / 2; i++) {
            System.out.println(staticAges[i]);
        }
    }

    public static void singleDArray() {
        System.out.println(staticAges[0]);
        System.out.println(staticAges[1]);
        System.out.println(staticAges[2]);
        System.out.println(staticAges[3]);
        System.out.println(staticAges[4]);
    }
}
