class Solution {
    public char findTheDifference(String s, String t) {
        int ch1 = 0;
        int ch2 = 0;
        int i = 0;
        int j = 0;
        while(i<s.length() && j<t.length()){
            ch1 = ch1+s.charAt(i);
            ch2 = ch2+t.charAt(j);
            i++;j++;
        }

        while(i<s.length()){
            ch1 = ch1+s.charAt(i);
            i++;
        }
        while(j<t.length()){
            ch2 = ch2+t.charAt(j);
            j++;
        }
        int ans = Math.abs(ch1-ch2);
        return (char)(ans);
    }
}