import java.util.*;

public class demo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String str = sc.nextLine();
        int count=0;
        String vowels = "AEIOU";
        for (int i =0;i<str.length();i++) {
            if (str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u' ) {
                count++;}
            else if (vowels.indexOf(str.charAt(i))!=-1) {
                count++;
            }
            }System.out.println(count);
            
        for (int i=0;i<str.length();i++) {
            String u = "" ;
            char c = str.charAt(i);
            int cc=0;
            if (u.indexOf(c)==-1) {
                for (int j=0;j<str.length();j++) {
                
                        if (str.charAt(j)==c){
                            cc++;u+=c;
                        } 
                }
            }
            else continue;
            System.out.println(c+"="+cc);
        }
    }}

