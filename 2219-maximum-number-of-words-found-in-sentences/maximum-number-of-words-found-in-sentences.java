class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxw=0;
         for (String sentence : sentences) {
            String[] words = sentence.split(" ");
         
            if (words.length > maxw) {
                maxw = words.length;
            }
        }
        
        return maxw;

    }
}