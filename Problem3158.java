class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        int xor = 0;
        for(int n : nums){
            if(mp.containsKey(n)){
                mp.put(n,mp.get(n)+1);
            }else{
                mp.put(n,1);
            }
        }
        for(int n : mp.keySet()){
            if(mp.get(n) > 1){
                xor = xor^n;
            }
        }
        return xor;
    }
}