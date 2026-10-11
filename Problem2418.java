class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        TreeMap<Integer,String> mp = new TreeMap<>();

        for(int i = 0;i<names.length;i++){
            mp.put(heights[i],names[i]);
        }
        int i = 0;
        String[] ans = new String[names.length];
        for(Map.Entry<Integer,String> entry : mp.entrySet()){
            ans[i] = entry.getValue();
            i++;
        }
        reverse(ans);
        return ans;
    }
    private void reverse(String[] nums){
        for(int i = 0;i<nums.length/2;i++){
            String temp = nums[i];
            nums[i] = nums[nums.length-1-i];
            nums[nums.length-1-i] = temp;
        }
    }
}