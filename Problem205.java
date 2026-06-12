class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        HashMap<Character,Character> mp1 = new HashMap<>();
        HashMap<Character,Character> mp2 = new HashMap<>();

        int i = 0;

        while(i<s.length()){
            if(mp1.containsKey(s.charAt(i)) && mp1.get(s.charAt(i)) != t.charAt(i)){
                return false;
            }
            if(mp2.containsKey(t.charAt(i)) && mp2.get(t.charAt(i)) != s.charAt(i)){
                return false;
            }
            mp1.put(s.charAt(i),t.charAt(i));
            mp2.put(t.charAt(i),s.charAt(i));
            i++;
        }
        return true;
    }
}