import java.util.Scanner;

public class demo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count =str.codePointCount(1, str.length());
        System.out.println(count);
        
    }
}

 /*  System.out.println("Enter the String with Space: ");
        String str= sc.nextLine();
        String ws = str.replace(" ","");

         System.out.println(ws); /*
         System.out.println("Enter the no of Elements:");
        int n = sc.nextInt();
        int [] arr=new int [n];
        for (int i=0; i<=arr.length - 1 ;i++) {
            arr [i] =sc.nextInt();
        }
        for (int i= arr.length - 1 ; i>=0;i--) {
            System.out.print(arr[i]);
        }System.out.println();
        
         
         */