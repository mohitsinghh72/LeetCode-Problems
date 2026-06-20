class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(candidates);
        combination(0,candidates,target,new ArrayList<>(),list);
        return list;

    }
    public void combination(int ind,int[] arr,int target,List<Integer> ds,List<List<Integer>> list){
        if(target == 0){
            list.add(new ArrayList<>(ds));
            return;
        }
        for(int i = ind;i<arr.length;i++){
            if(i>ind && arr[i] == arr[i-1]) continue;
            if(arr[i] > target)break;

            ds.add(arr[i]);
            combination(i+1,arr,target-arr[i],ds,list);
            ds.remove(ds.size()-1);
        }
    }
}