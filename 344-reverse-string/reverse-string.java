class Solution {
    public static  void reverseString(char[] s) {
        int l=0;
        int r=s.length-1;
        while(l<r){
            char t=s[l];
            s[l]=s[r];
            s[r]=t;
            l++;
            r--;
        }


    }
    public static void main(String[] args){
        char[] letter={'h','e','l','l','o'};
        reverseString(letter);
    }
}