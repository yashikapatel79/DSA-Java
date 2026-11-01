class Solution {
    public int thirdMax(int[] nums) {

        Long first = null , second = null, third = null;

        for(int num : nums){

            //Skip duplicates
            if((first != null && num == first) ||
               (second != null && num == second) ||
               (third != null && num == third)) {
                continue;
               }

               //ifcurrent number is the largest
               if(first == null || num > first){
                third = second;
                second = first;
                first = (long) num;
               }

               //if current number is the second largest
               else if(second == null || num > second){
                third = second;
                second = (long) num;
               }

               //if current is the third largest
               else if(third == null || num > third){
                third = (long) num;
               }
        }
                //return third maximum, otherwise return first maximum
                return third == null ? first.intValue() : third.intValue();
    }
}