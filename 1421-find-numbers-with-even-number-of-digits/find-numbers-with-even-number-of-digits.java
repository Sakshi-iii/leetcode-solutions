class Solution {
    public int findNumbers(int[] nums) {
        int c=0;
        int d=0;
        for(int i=0;i<nums.length;i++){
            while(nums[i]!=0){
                d++;
                nums[i]=nums[i]/10;
            }
            if(d%2==0)
            {
                c++;
            }
             d=0;
        }
        return c;
    }
}