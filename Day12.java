class Solution {
// Function to find the smallest positive number missing from the array.
public int missingNumber(int[] arr) {
    // Your code here
    
    Arrays.sort(arr);
    int res=1;
    int n=arr.length;
    for(int i=0;i<n;i++){
        if(arr[i] == res){
            res+=1;
        }
        else if(arr[i] > res){
            break;
        }
    }
    return res;
}
}
