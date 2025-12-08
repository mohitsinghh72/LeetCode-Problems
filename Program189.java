class Solution {
    public int[] rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n; // important: reduce extra rotations

        // Step 1: reverse entire array
        reverse(nums, 0, n - 1);

        // Step 2: reverse first k elements
        reverse(nums, 0, k - 1);

        // Step 3: reverse the rest
        reverse(nums, k, n - 1);

        return nums;
    }

    private void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
}
