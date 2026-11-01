class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet <Integer> set = new HashSet<>();
        List<Integer> ans = new ArrayList<>();

        //Store all elements in an array
        for(int num : nums){
            set.add(num);
        }

        //Check which numbers are missing
        for(int i = 1; i <= nums.length; i++){
            if(!set.contains(i)){
                ans.add(i);
            }
        }
        return ans;
    }
}