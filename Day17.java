class Solution {
// Function to find the first non-repeating character in a string.
static char nonRepeatingChar(String s) {
    for(int i=0;i<s.length();i++){
    boolean found=false;
        for(int j=0;j<s.length();j++){
            if(i!=j && s.charAt(i) == s.charAt(j)){
                found=true;
                break;
            }
        }
    if(!found){
        return s.charAt(i);
    }
    }
    return '$';
}
}
