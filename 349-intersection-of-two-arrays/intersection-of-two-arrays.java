class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet <Integer> set = new HashSet<>();
        HashSet <Integer> result = new HashSet<>();

        //Store nums1 element
        for(int i =0; i<nums1.length; i++){
            set.add(nums1[i]);
        }


        //Traverse nums2 and check common elements
        for(int i =0; i<nums2.length; i++){
            if(set.contains(nums2[i])){
                result.add(nums2[i]);
            }
        }
        

        //Convert HashSet into int Array
        int [] ans = new int[result.size()];
        int k =0;

        for(int num : result){
            ans[k] = num;
            k++;
        }
        return ans;
    }
}