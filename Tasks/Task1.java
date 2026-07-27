import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //problem:1(Add two numbers)

        System.out.println("Enter the first number:");
        int a = sc.nextInt();
        System.out.println("Enter the second number:");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("The sum of " + a + " and " + b + " is: " + sum);

        //problem:2(Convert Celsius to Fahrenheit)
        System.out.println("Enter temperature in Celsius:");
        double celsius = sc.nextDouble();
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println(celsius + " degrees Celsius is equal to " + fahrenheit + " degrees Fahrenheit.");
        
        //problem:3(Find the square of a number)
        System.out.println("Enter a number to find its square:");
        int num = sc.nextInt();
        int square = num * num;
        System.out.println("The square of " + num + " is: " + square);

        sc.close();
    }
 
}