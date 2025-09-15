class Solution {
    public void moveZeroes(int[] nums) {
        int i=0;
        int j=nums.length;
        int k=0;
        while(j!=0){
            if(nums[i]!=0){
                nums[k]=nums[i];
                k++;
            }
            i++;
            j--;
        }
        while(k<nums.length){
            nums[k]=0;
            k++;
        }
    }
}