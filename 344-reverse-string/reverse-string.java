class Solution {
    public void reverseString(char[] s) {
        helper(s,0,s.length-1);
    }
    public void helper(char[] s,int start,int end){
        if(start>=end){
            return;
        }
        char t=s[start];
        s[start]=s[end];
        s[end]=t;
        helper(s,start+1,end-1);

    }
}