class Solution {
    public List<Integer> getRow(int rowIndex) {
        
        List <Integer> ans = new ArrayList<>();

        for(int i = 0; i<= rowIndex; i++){

            List <Integer> row = new ArrayList<>();

            //First element is always 1
            row.add(1);

            //Calculate the middle elements using the previous row
            for(int j = 1; j < i; j++){
                row.add(ans.get(j-1)+ ans.get(j));
            }

            //last element is always 1 except the first row
            if(i > 0){
                row.add(1);
            }

            //Store the current row for the next iteration
            ans = row;
        }

        return ans;
    }
}