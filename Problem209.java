class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int min = Integer.MAX_VALUE;
        int i = 0;
        int j = 0;
        int sum = 0;
        while(i<nums.length){
            sum += nums[i];
            while(sum >= target){
                min = Math.min(min,i-j+1);
                sum -= nums[j];
                j++;
            }
            i++;
        }
        if(min == Integer.MAX_VALUE){
            return 0;
        }else{
            return min;
        }
    }
}