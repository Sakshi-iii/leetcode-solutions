class Solution {
    public int minRemoval(int[] nums, int k) {
      int n=nums.length;
      Arrays.sort(nums);
      int L=1;
      int i=0,j=0;
      while(j<n) {
        while(i<j && (long)nums[j]>k*(long)nums[i]){
            i++;
        }
        L=Math.max(L,j-i+1);
        j++;
      }
      return n-L;
    }
}