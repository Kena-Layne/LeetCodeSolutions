/*

Input: [1,2,3]
Output: null
Explanation: After calling your function, the input array is modified to: [1,2,3]

*/

class Solution {
    public void duplicateZeros(int[] arr) {
        for(int i = 0; i<arr.length-1; i++){
            if (arr[i]==0){
                for (int j = arr.length-2; j > i; j--){
                // Shift each element one position to the right.
                    arr[j + 1] = arr[j];
                    
                }
                arr[i+1]=0;
                i++;
            
            }
        }
    }
}