class Solution {
    public boolean containsDuplicate(int[] nums) {
        if(nums.length==0){
            return false;
        }
        Arrays.sort(nums);
        int count=0;
        int max=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i+1]==nums[i]){
                count++;
                max=Math.max(max,count);
                if(max>0) return true;
            }else{
                count=0;
            }
        }
        return false;
    }
}