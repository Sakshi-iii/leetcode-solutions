class Solution {
    public boolean check(int[] nums) {
       int count=0;
       for(int i=0;i<nums.length-1;i++){
        if(nums[i]>nums[i+1]){
            count++;
        }
       }//basically if given array will be exactly in non decreasing and rotating then count can be 0 or 1, 
       if(nums[nums.length-1]>nums[0]){
        count++;
       }
       if(count<=1){
        return true;
       }else{
        return false;
       }
    
    } 
}