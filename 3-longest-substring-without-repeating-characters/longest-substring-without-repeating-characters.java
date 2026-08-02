class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s==null || s.length()==0) return 0;
        int l=0;
        int m=0;
        Set<Character> v = new HashSet<>();
        for(int r=0;r<s.length();r++){
            char rc=s.charAt(r);
            while(v.contains(rc)){
                v.remove(s.charAt(l));
                l++;
            }
            v.add(rc);
            m=Math.max(m,r-l+1);
        }
        return m;
    }
}