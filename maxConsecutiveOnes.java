/* Given a binary array nums, return the maximum number of consecutive 1's in the array. 
Ex.
Input: nums = [1,0,1,1,0,1]
Output: 2

*/

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int soln=0;
        int temp=0;
        for(int i=0; i<nums.length; i++){
            if (nums[i] == 1){
                temp++;
                if(soln<temp){
                    soln=temp;
                }
            }else if (nums[i]==0){
                if(soln<temp){
                    soln=temp;
                    }
                temp=0;
            }
            
        }
        return soln;
    }
}