import java.util.*;

public class Reversestar{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the quantity of stars:");
        int n = sc.nextInt();
        System.out.println("Descending star:");
        for(int i =0; i<n;i++) {
            for (int j=i+1;j<=n;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("Ascending star:");
         for(int i =n; i>0;i--) {
            for (int j=n-i;j>=0;j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
