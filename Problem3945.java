class Solution {
    public int digitFrequencyScore(int n) {
        HashMap<Integer,Integer> mp = new HashMap<>();

        for(int i = 0;n>0;i++){
            if(mp.containsKey(n%10)){
                mp.put(n%10,mp.get(n%10)+1);
            }else{
                mp.put(n%10,1);
            }
            n = n/10;
        }
        int ans = 0;

        for(int num : mp.keySet()){
            int t = mp.get(num);
            ans = ans + (num*t);
        }
        return ans;

    }
}