public static int findEquilibrium(int arr[]) {
    int presum = 0, total = 0;
    for (int ele : arr) {
        total += ele;
    }

    for (int i = 0; i < arr.length; i++) {
        int suff = total - presum - arr[i];
        if (presum == suff) {
            return i;
        }
        presum += arr[i];
    }

    return -1;
}