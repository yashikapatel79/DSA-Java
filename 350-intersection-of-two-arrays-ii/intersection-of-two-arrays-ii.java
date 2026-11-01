class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();

        //Store frequency of elements in nums1
        for(int num : nums1){
            map.put(num , map.getOrDefault(num, 0)+1);
        }

        //Check common elements in nums
        for(int num : nums2){

            if(map.getOrDefault(num, 0) > 0){
                //Add common element to result
                list.add(num);

                //Decrease its frequency
                map.put(num, map.get(num) - 1);
            }
        }
        //Convert Arraylist into array
        int[] result = new int[list.size()];

        for(int i = 0; i< list.size(); i++){
            result[i] = list.get(i);
        }
        return result;
    }
}