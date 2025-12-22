class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {

        int[] sort = sort(arr1);
        boolean[] used = new boolean[sort.length];

        int[] ans = new int[arr1.length];
        int i = 0, j = 0, k = 0;

        // Step 1: elements in arr2 order
        while (i < arr2.length) {
            j = 0;
            while (j < sort.length) {
                if (!used[j] && arr2[i] == sort[j]) {
                    ans[k++] = sort[j];
                    used[j] = true;
                }
                j++;
            }
            i++;
        }

        // Step 2: remaining elements (already sorted)
        j = 0;
        while (j < sort.length) {
            if (!used[j]) {
                ans[k++] = sort[j];
            }
            j++;
        }

        return ans;
    }

    public int[] sort(int[] arr1) {
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length - i - 1; j++) {
                if (arr1[j] > arr1[j + 1]) {
                    int temp = arr1[j];
                    arr1[j] = arr1[j + 1];
                    arr1[j + 1] = temp;
                }
            }
        }
        return arr1;
    }
}
