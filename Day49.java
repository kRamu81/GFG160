class Solution {
public int countSubarrays(int arr[], int k) {
    Map<Integer, Integer> prefixsum=new HashMap<>();
    int res=0;
    int csum=0;
    for(int i=0;i<arr.length;i++){
        csum+=arr[i];
        if(csum == k){
            res++;
        
        }
        if(prefixsum.containsKey(csum - k))
            res+=prefixsum.get(csum-k);
        prefixsum.put(csum, prefixsum.getOrDefault(csum,0)+ 1);
    }
    return res;
    // code here
}
}
