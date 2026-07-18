import java.util.Scanner;

class Solution {
    public static boolean isPalindrome(int x) {
      int r=0;
      int o=x;
      if(x<0) {
        return false;
      }
      while(x!=0){
        int d = x%10;
        if(r > Integer.MAX_VALUE /10 || r == Integer.MAX_VALUE /10 && d >7 ){
            return false ;
        }
        r = r*10 +d;
        x=x/10;
      }  
      if(o==r){
        return true;
      }
      else {
        return false;
      }
    }
     public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        int original =sc.nextInt();
        System.out.println(isPalindrome(original));
        sc.close();
        
    }
}