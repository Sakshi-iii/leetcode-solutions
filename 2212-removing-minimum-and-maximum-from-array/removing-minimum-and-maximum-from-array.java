class Solution {
    public int minimumDeletions(int[] nums) {
       int n=nums.length;
       int maxInd=0;
       int minInd=0;
       for(int i=0;i<n;i++){
        if(nums[i]<nums[minInd]) minInd=i;
        if(nums[i]>nums[maxInd]) maxInd=i;
       }
       int left=Math.min(minInd,maxInd);
       int right=Math.max(minInd,maxInd);
       int front=right+1;
       int back=n-left;
       int mix=(left+1)+(n-right);

       return Math.min(front,Math.min(mix,back));

    }
}