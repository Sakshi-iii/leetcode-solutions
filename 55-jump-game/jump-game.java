class Solution {
    public boolean canJump(int[] nums) {
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(i<=max){
                if(i+nums[i]>max){
                    max=i+nums[i]; 
                }
            }else
            return false;
        }
        return true;
       
    }
}