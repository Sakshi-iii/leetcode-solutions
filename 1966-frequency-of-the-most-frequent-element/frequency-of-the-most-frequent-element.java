

class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        
        long currentSum = 0;
        int left = 0;
        int maxFrequency = 0;
        
        for (int right = 0; right < nums.length; right++) {
            currentSum += nums[right];
            
            long cost = (long)nums[right] * (right - left + 1) - currentSum;
            
            while (cost > k) {
                currentSum -= nums[left];
                left++;
                cost = (long)nums[right] * (right - left + 1) - currentSum;
            }
            
            maxFrequency = Math.max(maxFrequency, right - left + 1);
        }
        
        return maxFrequency;
    }
}