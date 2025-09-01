class Solution {
    public void sortColors(int[] nums) {
        for(int j=0;j<nums.length;j++)
        for(int i=j;i<nums.length;i++){
            if(nums[j]>nums[i]){
                int temp=nums[j];
                nums[j]=nums[i];
                nums[i]=temp;
            }
        }
    }
}