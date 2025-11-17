class Solution {
    public int findNumbers(int[] nums) {
        int countEven = 0;                          //This count the Even numbers in array
        for(int i = 0;i<nums.length;i++){
            int countInsideDigit = 0;               //This count the digit at index
            while(nums[i]!=0){
                int rem = nums[i]%10;
                countInsideDigit = countInsideDigit+1;
                nums[i] = nums[i]/10;
            }
            if(countInsideDigit %2 == 0){
                countEven = countEven+1;
            }
        }
        return countEven;
    }
}