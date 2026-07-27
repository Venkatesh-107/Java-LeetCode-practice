import java.util.*;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of elements:");
        int n = sc.nextInt();
        int [] arr = new int[n]; int [] arr1 = new int[n]; int l= 0;
        System.out.println("Enter the elements:");
        for (int i =0; i<n;i++) {
            arr1[i]= sc.nextInt();
            if(arr1[i]==0) {
                arr[n-1]=0;
            }
            else{
                arr[l++]=arr1[i];               
            }
        }
        //move all 0's to end
        System.out.println("Array:");
        for(int i=0;i <n;i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
        
        Arrays.sort(arr);
        System.out.println("Sorted Array:");
        for(int i=0;i <n;i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
    
    }
    
}
