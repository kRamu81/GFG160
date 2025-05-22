class Solution {
public int kthMissing(int[] arr, int k) {
    
    // code here
    Set<Integer> set=new HashSet<>();
    for(int num:arr){
        set.add(num);
        }
    int count=0; int curr=0;
    while(count<k){
        curr++;
        if(!set.contains(curr)){
            count++;
        }
    }
    return curr;
}
}
