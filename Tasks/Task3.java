import java.util.*;
import java.io.*;

public class Task3 {
    public static void main(String [] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String :");
        String s = sc.nextLine();

        System.out.println("String :" + s);    
        System.out.println("Reverse String (F) :" + Function(s));
        System.out.println("Reverse (L) :" + LoopFunction(s));
 
       sc.close();
    }

    public static String Function(String s) {
        // Reverse string using Built-infunction 
        String r = new StringBuffer(s).reverse().toString();
        return r;
    }
    public static String LoopFunction(String s) {
        // Reverse string using loop 
       String r = "";
       for (int i = s.length() - 1; i>= 0; i--) {
        r += s.charAt(i);
       }
         return r;
    }

}
