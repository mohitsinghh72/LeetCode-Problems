class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int count = 0;
        for(int i = 0;i<nums.length;i++){
            int temp = countEach(nums[i],digit);
            count = count+temp;
        }
        return count;
    }
    private int countEach(int n,int digit){
        int count = 0;
        while(n > 0){
            int temp = n%10;
            if(temp == digit){
                count++;
            }
            n = n/10;
        }
        return count;
    }
}