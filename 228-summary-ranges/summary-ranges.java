class Solution {
    public List<String> summaryRanges(int[] nums) {
        
        List<String> ans = new ArrayList<>();

        int i =0;

        while(i<nums.length){

            //Store the starting number of the range
            int start = nums[i];

            //Move forward while numbers are consecutive
            while(i+1 < nums.length && nums[i+1] == nums[i] + 1){
                i++;
            }

        //Add a single no or a range to the answer
        if(start == nums[i]){
            ans.add(String.valueOf(start));
        } else {
            ans.add(start + "->" + nums[i]);
        }

        //Move to the next range
        i++;
        }

        return ans;
    }
}