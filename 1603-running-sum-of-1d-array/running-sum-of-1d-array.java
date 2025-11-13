class Solution {
    public int[] runningSum(int[] nums) {
        int n=nums.length;
        int[] nums1=new int[n];
         int temp=0;
        for(int i=0;i<n;i++){
            temp=temp+nums[i];
            nums1[i]=temp;
        }
        return nums1;
    }
}