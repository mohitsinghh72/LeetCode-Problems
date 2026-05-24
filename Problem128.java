class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        int longest = 0;

        for(int i = 0;i<nums.length;i++){
            set.add(nums[i]);
        }

        for(int num : set){
            if(set.contains(num-1)){

            }else{
                int count = 1;
                while(set.contains(num+1)){
                    count +=1;
                    num = num+1;
                }
                longest = Math.max(longest,count);
            }
        }
        return longest;
    }
}