class Solution {
static final int MAX_CHAR=26;
public int longestUniqueSubstr(String s) {
    // code here
   int n=s.length();
   int res=0;
   int[] lastindex=new int[MAX_CHAR];
   for(int i=0;i<MAX_CHAR;i++){
       lastindex[i]=-1;
       
   }
   int start=0;
   for(int end=0;end<n;end++){
       start=Math.max(start,lastindex[s.charAt(end)-'a']+ 1);
       res=Math.max(res, end-start + 1);
       lastindex[s.charAt(end)-'a']=end;
   }
   return res;
    
}
}
