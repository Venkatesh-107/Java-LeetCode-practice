class Solution {
    public int diagonalSum(int[][] mat) {
        int n=mat.length;
        int sum=0;
        int l=0;
        int r=n-1;
        for(int i=0;i<n;i++){
            sum+=mat[i][l];
            if(l!=r){
                sum+=mat[i][r];
            }
            l++;
            r--;
        }
        return sum;
    }
}