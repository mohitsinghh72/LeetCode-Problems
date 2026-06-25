class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int start = 1;
        int end = maxValue(piles);
        int ans = Integer.MAX_VALUE;

        while(start<=end){
            int mid = start+(end-start)/2;
            long totalhr = gettotal(piles,mid);
            if(totalhr <= h){
                ans = mid;
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return ans;
    }
    public long gettotal(int[] nums,int mid){
        long total = 0;

        for(int i = 0;i<nums.length;i++){
            total = total+((nums[i]+mid-1L)/mid) ;
        }
        return total;
    }
    public int maxValue(int[] arr){
        if(arr.length == 0){
            return -1;
        }
        int max = arr[0];
        for(int i = 1;i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}