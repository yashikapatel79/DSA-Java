class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean inc = true;
        boolean dec = true;

        //Traverse the array
        for(int i = 1; i < nums.length; i++){

            //checking inc cond
            if(nums[i] < nums[i-1]){
                inc = false;
            }

            //check dec cond
            if(nums[i] > nums[i-1]){
                dec = false;
            }
        }
        //Atleast one cond must be true
        return inc || dec;
    }
}