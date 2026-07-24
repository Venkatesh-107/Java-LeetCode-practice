class Solution {
    public int maximumWealth(int[][] accounts) {
        int n=accounts.length;
        int sum=0;
        for(int i=0;i<n;i++){
            int sum1=0;
            for(int j=0;j<accounts[i].length;j++){
                sum1 +=accounts[i][j];
                sum=Math.max(sum1,sum);
            }
        }
        return sum;
    }
}