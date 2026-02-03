class Solution {
    public int averageValue(int[] nums) {
        ArrayList<Integer> temp = new ArrayList<>();
        for(int i = 0;i<nums.length;i++){
            if(nums[i]%2 == 0 && nums[i]%3 == 0){
                temp.add(nums[i]);
            }
        }
        int avg = 0;
        int sum = 0;
        for(int i = 0;i<temp.size();i++){
            sum = sum + temp.get(i);
        }
        if(sum!=0){
            avg = sum/temp.size();
        }
        return avg;
    }
}