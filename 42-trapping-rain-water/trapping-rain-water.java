class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int [] leftmax= new int [n];
        int [] rightmax=new int [n];
        int total=0;
        leftmax[0]=height[0];
        for(int i=1;i<n;i++){
            leftmax[i]=Math.max(leftmax[i-1],height[i]);
        }
        rightmax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            rightmax[i]=Math.max(rightmax[i+1],height[i]);
        }
        for(int i=0;i<n;i++){
            int water = Math.min(leftmax[i],rightmax[i]);
            total+=water-height[i];
        }
        return total;

    }
}
/*
class Solution {
    public int trap(int[] height) {
        if (height == null || height.length == 0) return 0;
        
        int left = 0;
        int right = height.length - 1;
        
        int leftMax = 0;
        int rightMax = 0;
        
        int totalWater = 0;
        
        while (left < right) {
            // Process the side that is lower, because it acts as the limiting wall
            if (height[left] < height[right]) {
                if (height[left] >= leftMax) {
                    leftMax = height[left]; // Update highest wall on left
                } else {
                    totalWater += leftMax - height[left]; // Trap water
                }
                left++;
            } else {
                if (height[right] >= rightMax) {
                    rightMax = height[right]; // Update highest wall on right
                } else {
                    totalWater += rightMax - height[right]; // Trap water
                }
                right--;
            }
        }
        
        return totalWater;
    }
}
*/
