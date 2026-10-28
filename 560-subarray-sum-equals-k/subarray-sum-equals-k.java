class Solution {
    public int subarraySum(int[] nums, int k) {
        int ans =0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int sum =0;
        for(int i =0; i<nums.length; i++){
            sum = sum+nums[i];
            int rmsum = sum - k;
            if(map.containsKey(rmsum)){
                ans = ans + map.get(rmsum);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return ans;
        
    }

}