class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int start = 1;
        int end = maxValue(nums);
        int ans = -1;

        while(start<=end){
            int mid = start+(end-start)/2;

            int total = getTotal(nums,mid);
            if(total <= threshold){
                ans = mid;
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return ans;

    }

    public int getTotal(int[] arr,int mid){
        int total = 0;

        for(int i = 0;i<arr.length;i++){
            total += (int)Math.ceil((double)arr[i]/mid);
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