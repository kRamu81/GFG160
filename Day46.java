class Solution {
public static int findUnion(int a[], int b[]) {
    // code here
    Set<Integer> st=new HashSet<>();
    for(int num:a){
        st.add(num);
    }
    for(int num:b){
        st.add(num);
    }
   
    
    return st.size();
}
}
