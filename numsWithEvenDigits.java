/*
Given an array nums of integers, return how many of them contain an even number of digits.

Input: nums = [555,901,482,1771]
Output: 1 
Explanation: 
Only 1771 contains an even number of digits.

*/

class Solution {
    public int findNumbers(int[] nums) {
        int soln=0;
        for(int i=0; i < nums.length; i++){
            String number;
            Integer num = nums[i];
            number = num.toString();
            if (number.length()%2==0)
                soln++;
        }
        return soln;
    }
}