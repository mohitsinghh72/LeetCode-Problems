class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<>();
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
                ans.add(nums[j]);
                j++;
            }
        }
        return ans;
    }
}