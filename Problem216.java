class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> list = new ArrayList<>();
        generate(k,n,new ArrayList<>(),list,1);
        return list;

    }
    private void generate(int k,int n,List<Integer> temp,List<List<Integer>> list,int i){
        if(k == 0 && n == 0){
            list.add(new ArrayList<>(temp));
            return;
        }
        if(i > 9 || k<0 || n<0){
            return;
        }
        temp.add(i);
        generate(k-1,n-i,temp,list,i+1);
        temp.remove(temp.size()-1);
        generate(k,n,temp,list,i+1);
    }
}