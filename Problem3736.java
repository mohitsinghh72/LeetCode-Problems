class Solution {
    public int minMoves(int[] nums) {
        int max = getMax(nums);
        int count = 0;
        for(int i = 0;i<nums.length;i++){
            count += Math.abs(max-nums[i]);
        }
        return count;
    }
    private int getMax(int[] nums){
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] > max){
                max = nums[i];
            }
        }
        return max;
    }
}