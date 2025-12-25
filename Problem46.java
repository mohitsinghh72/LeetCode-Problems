public class Solution {

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        solve(nums, 0, ans);
        return ans;
    }

    private static void solve(int[] nums, int index, List<List<Integer>> ans) {

        // BASE CASE
        if (index == nums.length) {
            List<Integer> temp = new ArrayList<>();
            for (int num : nums) temp.add(num);
            ans.add(temp);
            return;
        }

        // TRY ALL SWAPS
        for (int i = index; i < nums.length; i++) {
            swap(nums, index, i);       // choose
            solve(nums, index + 1, ans); // explore
            swap(nums, index, i);       // undo (backtrack)
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
}
