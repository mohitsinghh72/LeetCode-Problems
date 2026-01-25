class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int start = 0;
        int end = 1;
        int n = nums.length;

        while(start<n && end < n){
            if(nums[start]%2 == 0){
                start += 2 ;

            }else if(nums[end]%2!=0){
                end += 2;
            }else{
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
            }
        }
        return nums;
    }
}
