import java.util.*;
public List<Integer> findMajorityElements(int[] arr) {
int n = arr.length;
int candidate1 = 0, candidate2 = 0, count1 = 0, count2 = 0;

// Step 1: Find potential candidates
for (int num : arr) {
    if (num == candidate1) {
        count1++;
    } else if (num == candidate2) {
        count2++;
    } else if (count1 == 0) {
        candidate1 = num;
        count1 = 1;
    } else if (count2 == 0) {
        candidate2 = num;
        count2 = 1;
    } else {
        count1--;
        count2--;
    }
}

// Step 2: Verify the candidates
count1 = 0;
count2 = 0;
for (int num : arr) {
    if (num == candidate1) count1++;
    else if (num == candidate2) count2++;
}

List<Integer> res = new ArrayList<>();
if (count1 > n / 3) res.add(candidate1);
if (count2 > n / 3) res.add(candidate2);

// Ensure ascending order
if (res.size() == 2 && res.get(0) > res.get(1)) {
    Collections.swap(res, 0, 1);
}

return res;
}
