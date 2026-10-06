class Solution {
    public int kDistinctChar(String s, int k) {
        HashMap<Character,Integer> mp = new HashMap<>();
        int left = 0;
        int right = 0;
        int max = 0;
        while(right < s.length()){
            if(mp.containsKey(s.charAt(right))){
                mp.put(s.charAt(right),mp.get(s.charAt(right))+1);
            }else{
                mp.put(s.charAt(right),1);
            }
            while(mp.size() > k){
                mp.put(s.charAt(left),mp.get(s.charAt(left))-1);
                if(mp.get(s.charAt(left)) == 0){
                    mp.remove(s.charAt(left));
                }
                left++;
            }
            max = Math.max(max,right-left+1);
            right++;
        }
        return max;
    }
}