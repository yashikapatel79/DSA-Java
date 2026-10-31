class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();

        for(int i =0; i<numRows; i++){
             
             List<Integer> row = new ArrayList<>();

             //Traverse elements of the current row
             for(int j =0; j<=i; j++){
                
                //first and last elements are always 1
                if(j == 0 || j==i){
                    row.add(1);
                }else{
                    //Addd two elements from prev row
                    List<Integer> prev = ans.get(i-1);
                    row.add(prev.get(j-1) + prev.get(j));
                }
             }

             //Add the completed row to the answer
             ans.add(row);
        }
        return ans;
    }
}