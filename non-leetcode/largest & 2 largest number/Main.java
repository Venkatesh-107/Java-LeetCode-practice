import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] arr={10,50,70,20,30,40};
        Arrays.sort(arr);
        int n=arr.length;
        System.out.println("Largest Number:"+ arr[n-1]);
        System.out.println("Second Largest Number:"+ arr[n-2]);
    }
}
