class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        boolean[] freq = new boolean[nums.length];
        permutation(nums,new ArrayList<>(),list,freq);
        return list;
    }
    private void permutation(int[] nums,List<Integer> temp,List<List<Integer>> list,boolean[] freq){
        if(temp.size() == nums.length){
            list.add(new ArrayList<>(temp));
            return;
        }
        for(int i = 0;i<nums.length;i++){
            if(freq[i]){
                continue;
            }
            if(i > 0 && nums[i] == nums[i-1] && !freq[i-1]){
                continue;
            }
            freq[i] = true;
            temp.add(nums[i]);
            permutation(nums,temp,list,freq);
            temp.remove(temp.size()-1);
            freq[i] = false;
        }
    }
}