class Solution {
    public int majorityElement(int[] nums) {
        int numC=0;
        int count=0;
        for(int num:nums){
            if(count==0){
                numC=num;
                count=1;
            }else if(num==numC){
                count++;
            }else{
                count--;
            }
        }
        return numC;
    }
}