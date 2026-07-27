import java.util.*;
import java.io.*;

public class Task2 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();
        int [] arr = new int [n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        FUNCTION(arr,n);

        sc.close();
    }
    public static void FUNCTION(int [] arr, int n) {
        int largest = -1; 
        int secondlargest = -1; int small = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                secondlargest = largest;
                largest = arr[i];
            }
            else if (arr[i] > secondlargest && arr[i] != largest) {
                secondlargest = arr[i];
            }
            if (arr[i] <  small) { small = arr[i]; }
                
        }
        System.out.println("Second largest number: " + secondlargest);
        System.out.println("Smallest number: " + small);


    }
    
}
