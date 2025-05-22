class Solution {
// Function to search a given number in row-column sorted matrix.
public boolean searchMatrix(int[][] mat, int x) {
    int n=mat.length,m=mat[0].length;
    int lo=0,high=n*m-1;
    while(lo<=high){
        int mid=(lo+high)/2;
        int row=mid/m;
        int col=mid%m;
        if(mat[row][col] == x)
            return true;
        if(mat[row][col]<x){
            lo=mid+1;
        }
        else{
            high=mid-1;
        }
    }
    return false;
}
}
