import java.util.Arrays;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //1-Replace Characters l-x
        System.out.println("Enter the String:");
        String str = sc.nextLine();
        StringBuffer str1 = new StringBuffer(str.toLowerCase());
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) == 'l') {
                str1.setCharAt(i, 'x');
            }
        }
        System.out.println(str1);

        //2-Move Negative Numbers to One Side
        System.out.println("Enter the no of elements:");
        int n = sc.nextInt();
        int l = 0;
        System.out.println("Enter the elements:");
        int[] arr = new int[n];int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                arr1[l++] = arr[i];
            }
        }int p=l;
        for (int i=0;i<n;i++) {
            if(arr[i]>=0) {
                arr1[p++] = arr[i];
            }
        }
        System.out.println("Array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr1[i]+" ");
        }System.out.println();

        //3-Find Second Smallest Element
        Arrays.sort(arr);
        System.out.println("The second smallest number in array:"+arr[1]);

        //4-Duplicate Elements
        System.out.println("Enter the no of elements:");
        int n1 = sc.nextInt();
        System.out.println("Enter the elements:");
        int[] arr2 = new int[n1];
        for (int i = 0; i < n1; i++) {
            arr2[i] = sc.nextInt();
        }
        Arrays.sort(arr2);int l1=0;
        int [] count = new int[n1];
        for (int i=0;i<n1-1;i++) {
                if(arr2[i]==arr2[i+1]) {
                    count[l1++]=arr2[i];}
        }
        System.out.println("Duplicate numbers:");
        for (int i=0;i<l1;i++) {
             System.out.print(count[i]+" ");
        }System.out.println();

        //5-Two numbers whose sum = target
       System.out.println("Target number:");
        int Target = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < n1; i++) {
            for (int j = i + 1; j < n1; j++) {
                if (Target == (arr2[i] + arr2[j])) {
                    System.out.println("Indices: " + i + " and " + j);
                    found = true;
                    break;
                }
            }
            if (found) break;
        }
        if (!found) System.out.println("Target is not found");

    //6- merge array
    int [] res = new int[arr1.length+arr2.length];
    System.out.println("Merge Arrayof Array 1 and 2:");int i=0;int j=0; int k=0;
    while(i<arr1.length && j<arr2.length) {
        if(arr1[i]<=arr2[j] ) {
            res[k++]=arr1[i++];
        }else {
            res[k++]=arr2[j++];
        }
    }
    while (i< arr1.length) res[k++] = arr1[i++];
        while (j< arr2.length) res[k++] = arr2[j++];
    for(int z=0;z<k;z++) {
    System.out.print(res[z]+" ");}System.out.println();
       
        
    }

}
