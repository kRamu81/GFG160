class Solution {
    
    int getMinDiff(int[] arr, int k) {
    // code here
    int size=arr.length;
    Array.sort();
    int res=arr[n-1]-arr[0];
    for(int i=0;i<size;i++){
        if(arr[i]-k<0)
            continue;
        int minH=Math.min(arr[0]+k,arr[i]-k);
        int maxH = Math.max(arr[i - 1] + k, arr[n - 1] - k);
         res = Math.min(res, maxH - minH);
        
    }
    return res;
    }
}
