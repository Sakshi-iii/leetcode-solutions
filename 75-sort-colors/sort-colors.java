class Solution {
    public void sortColors(int[] nums) {
        int beg=0;
        int mid=0;
        int end=nums.length-1;
        while(mid<=end){
            if(nums[mid]==0){
                swap(nums,beg,mid);
                mid++;
                beg++;
            }else if(nums[mid]==2){
             swap(nums,mid,end);
                end--;   
            }else{             
                mid++;
            }
        }
    }
    public void swap(int[] nums,int a,int b){
        int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
}