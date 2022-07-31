package com.company.session1;

public class IdentifierAndIfs {
    public static void main(String[] args) {
        String name = "String";
        int age = 22;
        boolean isMarried = false;
        float cgpa = 3.5f;
        char grade = 'C';

        if(grade == 'A')
            System.out.println("Congratulations you got distinction");
        else if (grade == 'B')
            System.out.println("Congratulations you got B Grade");
        else
            System.out.println("You just passed");

        switch (grade)
        {
            case 'A':
                System.out.println("Congratulations you got distinction");
                break;
            case 'B':
                System.out.println("Congratulations you got B Grade");
                break;
            default:
                System.out.println("You just passed");
        }
    }
}
