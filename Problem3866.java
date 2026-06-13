class Solution {
    public int firstUniqueEven(int[] nums) {
        HashMap<Integer,Integer> mp = new HashMap<>();

        for(int n : nums){
            if(mp.containsKey(n)){
                mp.put(n,mp.get(n)+1);
            }else{
                mp.put(n,1);
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int n : mp.keySet()){
            if(mp.get(n) == 1 && (n%2 == 0)){
                list.add(n);
            }
        }

        for(int n : nums){
            if(n%2 == 0 && list.contains(n)){
                return n;
            }
        }
        return -1;
    }
}