import java.util.*;
public class demo2 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of elements :");
        int n = sc.nextInt();
        System.out.println("Enter the elements :");
        int [] arr = new int[n];
         for(int i=0;i<n;i++) {
            arr[i]=sc.nextInt();}
        System.out.println("Enter the count :");
        int count = sc.nextInt();
        int max=0;
        int sum =0;
        for (int i=0;i<=n-count;i++) {
            for (int j=0;j<count;j++) {
                
                sum += arr[j+j]; 
               
            } if(sum>max) {
                    max=sum;
                          
                } sum=0;  
                
           
        }  
        System.out.println("Max : " +  max);
    }
}
