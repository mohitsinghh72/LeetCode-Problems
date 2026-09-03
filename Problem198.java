class Solution {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp,-1);
        return robbed(nums,nums.length-1,dp);

    }
    private int robbed(int[] nums,int i,int[] dp){
        if(i == 0){
            return nums[i];
        }
        if(i < 0){
            return 0;
        }
        if(dp[i] != -1){
            return dp[i];
        }
        int pick = nums[i] + robbed(nums,i-2,dp);
        int notpick = 0 + robbed(nums,i-1,dp);

        return dp[i] = Math.max(pick,notpick);
    }
}