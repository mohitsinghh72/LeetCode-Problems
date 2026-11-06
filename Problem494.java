class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int sum = 0;

        for(int num : nums){
            sum += num;
        }
        if(Math.abs(target) > sum){
            return 0;
        }
        Boolean[][] visited = new Boolean[nums.length][2 * sum + 1];
        int[][] dp = new int[nums.length][2 * sum + 1];
        return count(nums,target,0,sum,visited,dp);
    }
    private int count(int[] nums,int target,int i,int offset,Boolean[][] visited,int[][] dp){
        if(i == nums.length){
            if(target == 0){
                return 1;
            }else{
                return 0;
            }
        }
        if(target < -offset || target > offset){
            return 0;
        }
        int col = target + offset;
        if(visited[i][col] != null){
            return dp[i][col];
        }
        int pos = count(nums, target - nums[i], i+1,offset, visited, dp);
        int neg = count(nums, target + nums[i], i+1,offset, visited, dp);

        visited[i][col] = true;
        return dp[i][col] = pos+neg;
    }
}