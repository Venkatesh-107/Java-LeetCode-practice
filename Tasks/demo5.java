import java.util.*;
public class demo5 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int [] arr = new int [n];
        for (int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        int l = 0;
        for (int i=0;i<arr.length-1;i++) {
                if (arr[i]%2==0) {
                    if(l<=arr[i]) { l = arr[i];

                    } 
            }
        }System.out.println("largest even no:"+l);

    }
}
