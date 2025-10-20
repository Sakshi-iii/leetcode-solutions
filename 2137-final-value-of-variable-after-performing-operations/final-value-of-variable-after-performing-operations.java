class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int X=0;
        for (String i:operations){
            if(i.equals("++X")||i.equals("X++")){
                X=X+1;
            }else if(i.equals("--X")||i.equals("X--")){
                X=X-1;
            }
            
        }
        return X;
    }
}