import java.util.Arrays;
import java.util.Scanner;

public class Task9 {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of elements :");
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i=0;i<n;i++) {
            arr [i] = sc.nextInt();
        }
        int l = arr[n-1];
         for (int i=n-2;i>=0;i--) {
            arr[i+1]=arr[i];
        }arr[0] = l;
         System.out.println("Array"+Arrays.toString(arr));
    }
}
