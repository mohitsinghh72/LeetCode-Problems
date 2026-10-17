class Solution {
    public int splitArray(int[] nums, int k) {
        if(k > nums.length){
            return -1;
        }
        int start = max(nums);
        int end = sum(nums);
        int ans = -1;

        while(start<=end){
            int mid = start+(end-start)/2;

            int count = countMax(nums,mid);
            if(count <= k){
                ans = mid;
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return ans;
    }
    private int countMax(int[] nums,int mid){
        int count = 1;
        int sum = 0;
        for(int i = 0;i<nums.length;i++){
            if(sum+nums[i] <= mid){
                sum += nums[i];
            }else{
                count++;
                sum = nums[i];
            }
        }
        return count;
    }
    private int max(int[] nums){
        int max = 0;
        for(int n : nums){
            if(n > max){
                max = n;
            }
        }
        return max;
    }
    private int sum(int[] nums){
        int sum = 0;
        for(int n : nums){
            sum += n;
        }
        return sum;
    }
}