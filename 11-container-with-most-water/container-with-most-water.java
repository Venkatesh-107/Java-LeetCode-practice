class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int max=0;
        int left=0;
        int right=n-1;int maxarea=0;
        while(left<right){
            int width=right-left;
            int currheight=Math.min(height[left],height[right]);
            int area=width*currheight;
            maxarea=Math.max(maxarea,area);
            if(height[left]<height[right]){
                left++;
            }
            else{right--;}
        }
        return maxarea;
    }
}