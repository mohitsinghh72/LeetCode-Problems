class Solution {
    public int findMin(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        int min = nums[0];

        int start = 0;
        int end = nums.length-1;

        while(start<=end){

            if(nums[start]<nums[end]){
                return Math.min(min,nums[start]);
            }

            int mid = start+(end-start)/2;

            min = Math.min(nums[mid],min);

            if(nums[mid]>=nums[start]){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return min;

    }
}