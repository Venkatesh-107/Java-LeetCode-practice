import java.util.*;
import java.io.*;

public class Task4 {
    public static void main(String [] args) {
       Scanner sc = new Scanner(System.in);
       //  1 - If condition even or odd
         System.out.println("Enter a number:");
         int num = sc.nextInt();
         if(num % 2 == 0) { 
            System.out.println(num + " is Even");
         }
            else { 
                System.out.println(num + " is Odd"); 
            }
       //  2 - If-Else Check eligible to vote 
         System.out.println("Enter the age:");
         int age = sc.nextInt();
            if (age >= 18) {
                System.out.println(" eligible to vote.");
            } else {
                System.out.println(" not eligible to vote.");
            }   
        // 3 - Nested If large number
        System.out.println("Enter three numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a >= b && a >= c) {
            System.out.println("Largest number is: " + a);
        } else if (b >= a && b >= c) {
            System.out.println("Largest number is: " + b);
        } else {
            System.out.println("Largest number is: " + c);
        }
        //  4 -  For Loop  1-10 
        System.out.println("1st 10 numbers are:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " ");
        }
        //  5 -  For Loop * Pattern
        System.out.println("Pattern:");
        for (int i = 1; i <= 5; i++) {
            
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
            
        }
        //  6 -  While Loop  10 - 1 
        System.out.println("Reverse of 10 numbers:");
        int i = 10;
        while (i >= 1) {
            System.out.println(i + " ");
            i--;
        }   
        //  7 -  While Loop Sum of 1 - 5 
        System.out.println("Sum of first 5 numbers:");
        int j = 1;
        int sum = 0;
        while (j <= 5) {
            sum += j;
            j++;
        }
        System.out.println(sum);
       //  8  Basic Class 
        System.out.println("Student info:");
        Student student = new  Student();
        System.out.println("Name: " + student.name);
        System.out.println("Marks: " + student.marks);

        sc.close();

    }
    public static class Student  {

        String name="John Doe";
        int marks=80;

        
    }
   
    

   
}
