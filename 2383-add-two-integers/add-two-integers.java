import java.util.*;

class Solution {
    public static int sum(int num1, int num2) {
        int sum=0;
        if (num1 >= -100 && num1 <= 100 && num2 >= -100 && num2 <= 100){
            sum=num1+num2;
        }
        else {
            System.out.println("Error");
        }
        return sum;
    }
    public static void main (String []args) {
        Scanner sc= new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        System.out.println("sum is " + sum(num1, num2));
        sc.close();

    }
}