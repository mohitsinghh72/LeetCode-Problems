class Solution {
    public int[] sortArray(int[] nums) {
        sortArray(nums, 0, nums.length - 1);
        return nums;
    }

    private void sortArray(int[] nums, int low, int hi) {
        if (low >= hi) {
            return;
        }

        int s = low;
        int e = hi;
        int m = s + (e - s) / 2;
        int pivot = nums[m];

        while (s <= e) {
            while (nums[s] < pivot) {
                s++;
            }
            while (nums[e] > pivot) {
                e--;
            }
            if (s <= e) {
                int temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp;
                s++;
                e--;
            }
        }

        sortArray(nums, low, e);
        sortArray(nums, s, hi);
    }
}
