//builtin functions in java
import java.util.*;
import java.lang.*;
import java.io.*;

public class demo {
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println(str.length()); // length of the string
        System.out.println(str.toUpperCase()); // convert to uppercase
        System.out.println(str.toLowerCase()); // convert to lowercase
        System.out.println(str.charAt(0)); // get character at index 0
        System.out.println(str.indexOf("o")); // get index of first occurrence of "o"
        System.out.println(str.substring(0, 5)); // get substring from index 0 to 5
    }
}
public class demo {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr)); // print array
        System.out.println(Arrays.sort(arr)); // sort array
        System.out.println(Arrays.binarySearch(arr, 3)); // search for element in array
    }
}
public class demo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list); // print list
        System.out.println(list.size()); // get size of list
        System.out.println(list.get(0)); // get element at index 0
        System.out.println(list.contains(2)); // check if list contains element
    }
}
public class demo {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        System.out.println(map); // print map
        System.out.println(map.size()); // get size of map
        System.out.println(map.get("one")); // get value for key "one"
        System.out.println(map.containsKey("two")); // check if map contains key
    }
}
public class demo {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        System.out.println(set); // print set
        System.out.println(set.size()); // get size of set
        System.out.println(set.contains(2)); // check if set contains element
    }
}
// string functions in java palindrome check    
import java.util.*;
import java.io.*;   
public class demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        if (isPalindrome(str)) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
        sc.close();
    }
    public static boolean isPalindrome(String str) {
        String cleanedStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversedStr = new StringBuilder(cleanedStr).reverse().toString();
        return cleanedStr.equals(reversedStr);
    }
}

// Reverse string in java
import java.util.*; 
import java.io.*;
public class demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        String reversedStr = new StringBuilder(str).reverse().toString();
        System.out.println("Reversed string: " + reversedStr);
        sc.close();
    }
}
// Reverse string without built-in functions
import java.util.*;
import java.io.*;
public class demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        String reversedStr = reverseString(str);
        System.out.println("Reversed string: " + reversedStr);
        sc.close();
    }
    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();


    }}
    // how to check Address of two strings in java
import java.util.*;
import java.io.*;
public class demo {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");
        System.out.println(str1 == str2); // true, because of string pool
        System.out.println(str1 == str3); // false, because str3 is a new object
        System.out.println(str1.equals(str3)); // true, because content is the same

        }
    }

     //fibonacci series in java 
import java.util.*;
import java.io.*;
public class demo {
    public static void main(String[] args) {   
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms:");
        int n = sc.nextInt();
        System.out.println("Fibonacci series:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        sc.close();
    }
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);     
        
    }
} 
//fibonacci series using recursion and loop
import java.util.*;
import java.io.*;
public class demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms:");
        int n = sc.nextInt();
        System.out.println("Fibonacci series using recursion:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        System.out.println("\nFibonacci series using loop:");
        int a = 0, b = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int temp = a;
            a = b;
            b = temp + b;
        }
        sc.close();
    }
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    //fibonacci using matrix exponentiation
import java.util.*;
import java.io.*;
public class demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms:");
        int n = sc.nextInt();
        System.out.println("Fibonacci series using matrix exponentiation:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        sc.close();
    }
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        int[][] F = {{1, 1}, {1, 0}};
        power(F, n - 1);
        return F[0][0];
    }
    public static void power(int[][] F, int n) {
        if (n == 0 || n == 1) {
            return;
        }
        int[][] M = {{1, 1}, {1, 0}};
        power(F, n / 2);
        multiply(F, F);
        if (n % 2 != 0) {
            multiply(F, M);
        }
    }
    public static void multiply(int[][] F, int[][] M) {
        int x = F[0][0] * M[0][0] + F[0][1] * M[1][0];
        int y = F[0][0] * M[0][1] + F[0][1] * M[1][1];
        int z = F[1][0] * M[0][0] + F[1][1] * M[1][0];
        int w = F[1][0] * M[0][1] + F[1][1] * M[1][1];
        F[0][0] = x;
        F[0][1] = y;
        F[1][0] = z;
        F[1][1] = w;
    }
