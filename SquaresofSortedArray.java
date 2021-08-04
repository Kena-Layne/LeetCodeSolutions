/*

Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
Input: nums = [-7,-3,2,3,11]
Output: [4,9,9,49,121]

*/

class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int i =0; i < nums.length; i++){
            int temp = nums[i];
            temp = temp*temp;
            nums[i]= temp;
        }
        Arrays.sort(nums);
        return nums;
    }
}