import java.util.*;

 class demo1 {
    public static void main(String [] args) {
        System.out.println("Enter the size");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter the elements");
        int [] arr = new int[n];

        for (int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("enter the target:");
        int target = sc.nextInt();
        twosum(arr,target);
         sc.close();

    }
      static int[] twosum(int[] arr , int target) {
            for (int i=0;i<arr.length;i++) {
            for (int j=i+1;j<arr.length;j++) {
                if (arr[i]+arr[j] == target) {
                    return new int[] {i,j};
                    break;
                    }
                }
            }
      

        }return new int[] {-1,-1};
        
        
       
 }


