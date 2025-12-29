class Solution {
    public int majorityElement(int[] nums) {
        if(nums.length == 0){
            return -1;
        }
        int ele = nums[0];
        int count = 0;

        for(int i = 0 ;i<nums.length;i++){
            if(nums[i] == ele){

                count++;

            }else{
                count--;
            }
            if(count == 0){
                ele = nums[i];
                count++;
            }
        }
        return ele;
    }
}