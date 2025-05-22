class Solution {
public static int minChar(String s) {
    
    int n = s.length();
    String rev = new StringBuilder(s).reverse().toString();

    
    String combined = s + "$" + rev;

    
    int[] lps = computeLPSArray(combined);

    
    return n - lps[lps.length - 1];
}

private static int[] computeLPSArray(String s) {
    int n = s.length();
    int[] lps = new int[n];
    int len = 0; 
    int i = 1;

    lps[0] = 0; 

    while (i < n) {
        if (s.charAt(i) == s.charAt(len)) {
            len++;
            lps[i] = len;
            i++;
        } else {
            if (len != 0) {
                len = lps[len - 1];
            } else {
                lps[i] = 0;
                i++;
            }
        }
    }

    return lps;
}
}
