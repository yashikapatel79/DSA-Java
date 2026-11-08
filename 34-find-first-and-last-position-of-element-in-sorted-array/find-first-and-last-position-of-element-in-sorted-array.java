class Solution {
    public int[] searchRange(int[] nums, int target) {
       
       int first = findFirst(nums , target);
       int last = findLast(nums , target);

       return new int[]{first , last};
    }
    //finding first occ of element
    public int findFirst(int[] nums , int target){
        int low = 0;
        int high = nums.length - 1;
        int ans = -1;

        while(low <= high){
            int mid = low + (high - low) / 2;

            if(nums[mid] == target){
                ans = mid;
                high = mid - 1; // searching left for any earlier occur if..
            }
            else if(nums[mid] < target){
                low = mid + 1;
            } 
            else{
                high = mid - 1;
            }
        }
        return ans;
    }

    //finding the last occu
    public int findLast(int[] nums, int target){
        int low = 0 , high = nums.length - 1;
        int ans = -1;

        while(low <= high){
            int mid = low + (high - low) / 2;

            if(nums[mid] == target){
                ans = mid;
                low = mid+1; // searching right for the later occu
            }
            else if(nums[mid] < target){
                low = mid + 1;
            }
            else{
                high = mid  - 1;
            }
        }
        return ans;
    }
}

/* int[] res = {-1, -1};
        int k =0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i]==target){
                res[k] = i;
                k++;
            }
        }
         return res; */