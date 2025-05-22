class Solution {
// Function is to check whether two strings are anagram of each other or not.
public static boolean areAnagrams(String s1, String s2) {

    HashMap<Character, Integer> map = new HashMap<>();
    // Your code here
    if(s1.length() != s2.length()){
        return false;
    }
    for(int i=0;i<s1.length();i++){
      if (map.containsKey(s1.charAt(i))) {
           
            map.put(s1.charAt(i),
                    map.get(s1.charAt(i)) + 1);
        }
        else {
           
            map.put(s1.charAt(i), 1);
        }
    }
     for (int i = 0; i < s2.length(); i++) {

       
        if (map.containsKey(s2.charAt(i))) {

            map.put(s2.charAt(i),
                    map.get(s2.charAt(i)) - 1);
        }
    }
     Set<Character> keys = map.keySet();
    for (Character key : keys) {
        if (map.get(key) != 0) {
            return false;
        }
    }
   
    return true;
}
}
