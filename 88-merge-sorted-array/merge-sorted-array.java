class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int l=m-1;int k=n-1;int y=m+n-1;
        while(l>=0 && k>=0){
            if(nums1[l]>=nums2[k]){
                nums1[y]=nums1[l];l--;
            }
            else{nums1[y]=nums2[k];k--;}
            y--;
        }
        while(k>=0){nums1[y]=nums2[k];k--;y--;}
        System.out.println(Arrays.toString(nums1));
    }
}