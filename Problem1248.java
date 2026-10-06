class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return atMost(nums,k)-atMost(nums,k-1);
    }
    private int atMost(int[] nums,int k){
        int sum = 0;int left = 0;
        int right = 0; int count = 0;
        int temp = 0;
        while(right<nums.length){
            if(nums[right] %2 != 0){
                temp++;
            }
            while(temp>k){
                if (nums[left] % 2 != 0) {
                    temp--;
                }
                left++;
            }
            count += right-left+1;
            right++;
        }
        return count;
    }
}