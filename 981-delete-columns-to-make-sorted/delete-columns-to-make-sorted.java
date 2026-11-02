class Solution {
    public int minDeletionSize(String[] strs) {

        int count =  0; //count when the unsorted colmn is removed

        //Traverse each column
        for(int j = 0; j < strs[0].length(); j++)
        {
            //compare consecutive rows
            for(int i = 0; i < strs.length - 1; i++){
                
                //check if the column is unsorted
                if(strs[i].charAt(j) > strs[i+1].charAt(j)){
                    count++;
                    break;
                }
            }
        }
        return count;

    }
}