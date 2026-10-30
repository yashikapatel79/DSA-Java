class Solution {
    public int[] plusOne(int[] digits) {

       //Traverse from right to left
       for(int i = digits.length-1; i>=0; i--){

        //if digits is less than 9, simply increment it
        if(digits[i] < 9 ){
            digits[i]++;
            return digits;
        }
         //if digits is 9, make it 0
            digits[i] = 0;
       } 


        //if all digits were 9, create a new array
        int[] ans = new int[digits.length + 1];

        //Put 1 at the first position
        ans[0] = 1;

        return ans;
    }

}