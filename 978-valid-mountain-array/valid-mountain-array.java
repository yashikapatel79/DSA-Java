class Solution {
    public boolean validMountainArray(int[] arr) {
        
        int n = arr.length;
        int i = 0;
        int j = n-1;

        while(i < n-1 && arr[i] < arr[i+1]){
            i++;
        }
        while(j > 0 && arr[j] < arr[j-1]){
            j--;
        }

        //both pointers must meet at the peak i!=0 or j!=0
        return i == j && i > 0 && j < n-1;
    }
}