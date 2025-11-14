class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> freq=new HashMap<>();
        for(int num:nums){
            freq.put(num,freq.getOrDefault(num,0)+1);
        }
        int maxfreq=Collections.max(freq.values());
        int count=0;
        for (int f: freq.values()){
            if(f==maxfreq){
                count+=f;
            }
        }
        return count;
    }
}