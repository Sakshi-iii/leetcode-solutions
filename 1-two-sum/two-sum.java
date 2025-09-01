class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        int [][] indexedNums= new int[n][2];
        for(int i=0;i<n;i++){
            indexedNums[i][0]=nums[i];
            indexedNums[i][1]=i;
        }
        Arrays.sort(indexedNums,Comparator.comparingInt(a->a[0]));
        int left=0;
        int right=n-1;
        while(left<right){
            int sum=indexedNums[left][0]+indexedNums[right][0];
            if(sum == target){
                return new int[]{indexedNums[left][1],indexedNums[right][1]};
            }else if(sum<target){
                left++;
            }else{
                right--;
            }
        }
        return new int[0];
    }
}