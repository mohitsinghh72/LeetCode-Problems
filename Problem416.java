class Solution {
    public boolean canPartition(int[] nums) {
        int totSum = 0;
        for(int i =  0;i<nums.length;i++){
            totSum += nums[i];
        }
        Boolean[][] dp = new Boolean[nums.length][totSum/2+1];
        if(totSum%2 == 1){
            return false;
        }
        return check(nums,totSum/2,0,dp);
    }
    private boolean check(int[] arr,int target,int i,Boolean[][] dp){
        if(target == 0){
            return true;
        }
        if(i == arr.length){
            if(target == 0){
                return true;
            }else{
                return false;
            }
        }
        if(dp[i][target] != null){
            return dp[i][target];
        }

        boolean take = false;
        if(target >= arr[i]){
            take = check(arr,target-arr[i],i+1,dp);
        }
        boolean nottake = check(arr,target,i+1,dp);

        return dp[i][target] = take||nottake;
    }
}