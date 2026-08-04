class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] ans = new int[nums.length];

        int i = 0;
        while(i<nums.length){
            if(i == 0){
                int sum = 0;
                for(int k = i+1;k<nums.length;k++){
                    sum += nums[k];
                }
                ans[i] = sum;
            }
            else{
                int sumleft = 0;
                int sumRight = 0;
                for(int j = 0;j<i;j++){
                    sumleft += nums[j];
                }
                for(int j = i+1;j<nums.length;j++){
                    sumRight += nums[j];
                }
                ans[i] = Math.abs(sumleft-sumRight);
            }
            i++;
        }
        return ans;
    }
}