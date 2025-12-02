class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] nums1 = squr(nums);

        for(int i = 0; i<nums1.length;i++){
            for(int j = i+1;j<nums1.length;j++){
                if(nums1[i]>nums1[j]){
                    int temp = nums1[i];
                    nums1[i] = nums1[j];
                    nums1[j] = temp;
                }
            }
        }
        return nums1;
    }

    public int[] squr(int[] nums){
        int i = 0;
        while(i<nums.length){
            nums[i] = nums[i]*nums[i];
            i++;
        }
        return nums;
    }

}