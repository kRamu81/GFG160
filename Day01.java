

    class Solution {
    public int getSecondLargest(int[] arr) {
        if(arr.length<2) return -1;
        // Code Here
        int largest=-1,secondLargest=-1;
        for(int num : arr){
            if(num>largest){
                secondLargest=largest;
                largest=num;
            }else if(num > secondLargest && num!=largest){
                secondLargest=num;
            }
        }
        return secondLargest;
    }
    } 
  


