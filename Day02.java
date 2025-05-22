class Solution {
public void reverseArray(int arr[]) {
    // code here
    int n=arr.length-1;
  int left=0; int right=n;
  while(left < right){
      int temp=arr[right];
      arr[right]=arr[left];
      arr[left]=temp;
       
      left++;
      right--;
  }

     
}
}
