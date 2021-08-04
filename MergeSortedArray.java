/*

You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.

Merge nums1 and nums2 into a single array sorted in non-decreasing order.

The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.

Input: nums1 = [1], m = 1, nums2 = [], n = 0
Output: [1]
Explanation: The arrays we are merging are [1] and [].
The result of the merge is [1].

*/
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (m==0){
            for(int i = 0; i<n; i++){
                nums1[i]=nums2[i];
            }
        }
        if (n==0){
        
        }
        if ((n!=0) && (m!=0)){
            int j=0;
            for(int i = nums1.length-n; i<nums1.length; i++){
                nums1[i]=nums2[j];
                j++;
            }
            Arrays.sort(nums1);
        }
    }
}