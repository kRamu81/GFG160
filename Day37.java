class Solution {
// Function to rotate matrix anticlockwise by 90 degrees.
static void rotateby90(int mat[][]) {
    // code here
    int n=mat.length;
    int res[][]=new int[n][n];
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            res[n-j-1][i]=mat[i][j];
        }
        
    }
    for(int i=0;i<n;i++){
        System.arraycopy(res[i],0,mat[i],0,n);
    }
}
}
