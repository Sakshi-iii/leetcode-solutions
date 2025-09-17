class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int count=1;
        int max=0;
        int M_E=nums[0];
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                count++;
            }else{
                count=1;
            }
            if(max<count){
                max=count;
                M_E=nums[i];
            }
        }
        return M_E;
    }
}