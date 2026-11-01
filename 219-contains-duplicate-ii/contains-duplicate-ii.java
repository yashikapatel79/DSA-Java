class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){

            //Check if element exists
            if(map.containsKey(nums[i])){

                //Check whether index difference is <=k
                if(i - map.get(nums[i]) <= k ){
                    return true;
                }
            }
            //Store the latest index of the element
            map.put(nums[i] , i);
        }
        return false;
    }
}