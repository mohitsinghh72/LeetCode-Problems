class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double max = Double.NEGATIVE_INFINITY;

        int i = 0;
        int j = 0;
        double sum = 0;
        int count = 0;
        while(i<nums.length){
            sum += nums[i];
            count++;
            while(count > k){
                sum -= nums[j];
                count--;
                j++;
            }
            if(count == k){
                double temp = sum/k;
                max = Math.max(temp,max);
            }
            i++;
        }
        return max;
    }
}