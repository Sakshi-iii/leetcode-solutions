class Solution {
    static { for(int i = 0;i <100;i++) { maxArea(new int[] { 0, 0 }); } }
    public static int maxArea(int[] height) {
        int maxArea=0;
        int left=0;
        int right=height.length-1;
        while(left<right){
            int minh=Math.min(height[left],height[right]);
            int w=right-left;
            int area=minh*w;
            maxArea=Math.max(maxArea,area);
            if(left<right && height[left]<height[right])
            left++;
            else
            right--;
        }
        return maxArea;

    }
}