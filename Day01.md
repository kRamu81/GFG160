Given an array of positive integers arr[], return the second largest element from the array. If the second largest element doesn't exist then return -1.

Note: The second largest element should not be equal to the largest element.

Examples:

Input: arr[] = [12, 35, 1, 10, 34, 1]
Output: 34
Explanation: The largest element of the array is 35 and the second largest element is 34.

Input: arr[] = [10, 5, 10]
Output: 5
Explanation: The largest element of the array is 10 and the second largest element is 5.

Input: arr[] = [10, 10, 10]
Output: -1
Explanation: The largest element of the array is 10 and the second largest element does not exist.

---
🧠 My Approach:
- 1️⃣ Initialize Two Variables:

  largest = -1
  secondLargest = -1
- 2️⃣ Iterate Through the Array:

  Compare each element to largest and update accordingly.
  Keep track of the second largest by ensuring it’s distinct from the largest element.
- 3️⃣ Edge Cases:

  Arrays with fewer than two elements or all elements being equal return -1.
---
```
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
  

```