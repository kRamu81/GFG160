class Solution {
public ArrayList<Integer> intersectionWithDuplicates(int[] a, int[] b) {
    // code here
    
    HashSet<Integer> sa=new HashSet<>();
    for(int num : a){
        sa.add(num);
    }
    ArrayList<Integer> res=new ArrayList<Integer>();
    for(int num:b){
        if(sa.contains(num)){
            res.add(num);
            sa.remove(num);
        }
    }
    return res;
}
}
