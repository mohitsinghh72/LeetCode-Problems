class Solution {
    public int rob(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }

        int case1 = robrange(nums,0,nums.length-2);
        int case2 = robrange(nums,1,nums.length-1);

        return Math.max(case1,case2);
    }
    private int robrange(int[] nums,int start,int end){
        int[] dp = new int[nums.length];
        Arrays.fill(dp,-1);
        return robbed(nums,start,end,dp);
    }
    private int robbed(int[] nums,int i,int end,int[] dp){
        if(i > end){
            return 0;
        }
        if(dp[i] != -1){
            return dp[i];
        }
        int pick = nums[i] + robbed(nums,i+2,end,dp);
        int notpick = robbed(nums,i+1,end,dp);

        return dp[i] = Math.max(pick,notpick);
    }
}