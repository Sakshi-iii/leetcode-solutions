class Solution {
    public int pivotIndex(int[] nums) {
        int RSum=0;
        int LSum=0;
        for(int i=0;i<nums.length;i++){
            RSum+=nums[i];
        }
         for(int i=0;i<nums.length;i++){
            RSum-=nums[i];
            if(LSum==RSum){
                return i;
            }
            LSum+=nums[i];
        }
        return -1;
    }
}