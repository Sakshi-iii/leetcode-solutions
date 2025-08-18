class Solution {
    public int trap(int[] height) {
        int left=0;
        int right=height.length-1;
        int leftMax=0;
        int rightMax=0;
        int totalWater=0;
        if(height==null||height.length<3){
            return 0;
        }
        while(left<right){
            if(height[left]<=height[right]){
                if(leftMax<height[left]){
                    leftMax=height[left];
                }else{
                    totalWater+=leftMax-height[left];
                }
                left++;
            }else{
                if(rightMax<height[right]){
                    rightMax=height[right];
                }
                else{
                    totalWater+=rightMax-height[right];
                }
                right--;
            }
        }
        return totalWater;
    }
}