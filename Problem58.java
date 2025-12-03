class Solution {
    public int lengthOfLastWord(String s) {
        String[] parts = s.split(" ");

        int n = parts.length-1;
        int count = 0;
        int len = parts[n].length();
        int i = 0;
        while(i<len){
            count = count+1;
            i = i+1;
        }
        return count;
    }
}