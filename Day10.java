class Solution {

// arr: input array
// Function to find the sum of contiguous subarray with maximum sum.
int maxSubarraySum(int[] arr) {

   int n = arr.length;
    
    // Initialize with the first element
    int maxEndingHere = arr[0];
    int maxSoFar = arr[0];
    
    // Traverse the array starting from the second element
    for (int i = 1; i < n; i++) {
        // Update maxEndingHere
        maxEndingHere = Math.max(arr[i], maxEndingHere + arr[i]);
        
        // Update maxSoFar
        maxSoFar = Math.max(maxSoFar, maxEndingHere);
    }
    
    return maxSoFar;
}
}
