class Solution {
    public int alternatingSum(int[] nums) {
        int i = 0;
        int sum = 0;
        while(i<nums.length){
            if(i%2 == 0){
                sum =sum+nums[i];
                i++;
            }else{
                sum = sum-nums[i];
                i++;
            }
        }
        return sum;

    }
}