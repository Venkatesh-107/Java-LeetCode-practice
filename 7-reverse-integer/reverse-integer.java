import java.util.Scanner;
class Solution {
    public static int reverse(int x) {
        int r=0;
     while(x!=0){
        int t= x % 10;
        if (r > Integer.MAX_VALUE / 10 || (r == Integer.MAX_VALUE / 10 && t > 8)) {
                return 0;
            }
        if (r < Integer.MIN_VALUE / 10 || (r == Integer.MIN_VALUE / 10 && t < -8)) {
                return 0;
            }
        r=r*10 + t;
        x=x / 10;
     } 
     return r;
    }
    public static void main (String []args) {
        Scanner sc = new Scanner (System.in);
        int num=sc.nextInt();
        System.out.println(reverse(num));
        sc.close();
    }
}