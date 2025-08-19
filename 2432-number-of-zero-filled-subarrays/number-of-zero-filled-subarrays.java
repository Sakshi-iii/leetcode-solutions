class Solution {
    public long zeroFilledSubarray(int[] nums) {
       long currentStreakZero=0;
       long totalSubArr=0;
       for(int num:nums) {
        if(num==0){
            currentStreakZero++;
            totalSubArr+=currentStreakZero;
        }else{
            currentStreakZero=0;
        }
       }
       return totalSubArr;
    }
}