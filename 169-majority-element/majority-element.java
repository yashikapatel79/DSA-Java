class Solution {
    public int majorityElement(int[] nums) {
      int candidate = 0;
      int count = 0;

      for(int i = 0; i<nums.length; i++){

        //select a new candidate when count becomes 0
        if(count == 0){
            candidate = nums[i];
        }

        //Increase count if current element matches candidate
        if(nums[i] == candidate){
            count++;
        } else{
            count--;
        }
      }
      return candidate;
    }
}






/*   int n = nums.length / 2;
        int result = 0;
        for(int i =0; i<nums.length-1; i++){
            int count =1;
            for(int j = i+1; j<nums.length ; j++){
                if(nums[i]==nums[j]){
                    count++;
                }
                if (count>n){
                    result = nums[i];
                }
            }
        }
       return result; */