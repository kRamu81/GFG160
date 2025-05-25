# 🚀 Day 1: Second Largest Element

## 💡 Problem Description
Given an array of positive integers `arr[]`, return the second largest element from the array. If the second largest element doesn't exist (i.e., all elements are equal), return `-1`.

**Note:** The second largest element should not be equal to the largest element.

---

## 🔍 Examples

### Example 1
**Input:** `arr[] = [12, 35, 1, 10, 34, 1]`  
**Output:** `34`  
**Explanation:** The largest element is 35, and the second largest is 34.

### Example 2
**Input:** `arr[] = [10, 5, 10]`  
**Output:** `5`  
**Explanation:** 10 is the largest, 5 is the second largest.

### Example 3
**Input:** `arr[] = [10, 10, 10]`  
**Output:** `-1`  
**Explanation:** No second largest since all elements are equal.

---

## ✅ Constraints
- `2 ≤ arr.length ≤ 10^5`
- `1 ≤ arr[i] ≤ 10^5`

---

## 🧠 Approach
1. Initialize two variables `first` and `second` with the minimum possible value.
2. Traverse through the array:
   - If current element > `first`: update `second` to `first`, and `first` to current element.
   - Else if current element > `second` and < `first`: update `second`.
3. Return `-1` if no valid second largest is found.

---

## ⏱️ Complexity
- **Time Complexity:** `O(n)`
- **Space Complexity:** `O(1)`

---

## 💻 Code Implementation

### Java
```java
class Solution {
    public int getSecondLargest(int[] arr) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num < first) {
                second = num;
            }
        }

        return second == Integer.MIN_VALUE ? -1 : second;
    }
}
```
Python solution 
```
class Solution:
    def getSecondLargest(self, arr):
        first = float('-inf')
        second = float('-inf')

        for num in arr:
            if num > first:
                second = first
                first = num
            elif num > second and num < first:
                second = num

        return -1 if second == float('-inf') else second
