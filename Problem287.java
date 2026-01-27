class Solution {
    public int findDuplicate(int[] nums) {
        int i = 0;
        while(i<nums.length){
            int correctIndex = nums[i]-1;
            if(nums[i] != nums[correctIndex]){
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;

            }
            else{
                i++;
            }
        }
        int j = 0;

        while(j<nums.length){
            int indexCheck = j+1;
            if(nums[j] == indexCheck){
                j++;
            }else{
                return nums[j];
            }
        }
        return -1;
    }
}