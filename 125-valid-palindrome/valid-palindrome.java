class Solution {
    public static boolean isPalindrome(String s) {
     int left=0;
     int right=s.length()-1;
     while(left<right){
        while(left<right && !Character.isLetterOrDigit(s.charAt(left))){ left++;}
        while(left<right && !Character.isLetterOrDigit(s.charAt(right))){ right--;}

        char lc=Character.toLowerCase(s.charAt(left));
        char rc=Character.toLowerCase(s.charAt(right));
        if(lc!=rc){  return false;  }
        left++;
        right--;
     }return true;
    }
    public static void main(String[] args){
        String s="A man , man is man ";
        isPalindrome(s);
    }
}