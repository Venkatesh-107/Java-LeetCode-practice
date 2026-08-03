class Solution {
    public int maxProfit(int[] prices) {
       int n=prices.length;
       int maximum=0;
       int cp=prices[0];
       for(int i=0;i<n;i++){
        int profit =prices[i]-cp;
        maximum=Math.max(maximum,profit);
        if(prices[i]<cp){
            cp=prices[i];
        }
       }
       return maximum;
    }
}