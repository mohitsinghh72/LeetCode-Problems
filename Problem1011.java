class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int start = maxValue(weights);
        int end = sumArr(weights);
        int ans = -1;

        while(start<=end){
            int mid = start+(end-start)/2;

            int numberOfDays = findDays(weights,mid);
            if(numberOfDays<=days){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return start;
    }
    public int maxValue(int[] arr){
        int max = arr[0];
        for(int i = 0;i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    public int sumArr(int[] arr){
        int sum = 0;
        for(int i = 0;i<arr.length;i++){
            sum = sum+arr[i];
        }
        return sum;
    }

    public int findDays(int[] arr,int mid){
        int days = 1; int load = 0;

        for(int i = 0;i<arr.length;i++){
            if(arr[i]+load > mid){
                days = days+1;
                load = arr[i];
            }else{
                load = load+arr[i];
            }
        }
        return days;
    }
}