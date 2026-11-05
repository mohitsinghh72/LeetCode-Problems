class Solution {
    public static int compress(char[] chars) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int k = 0;
        while(i<chars.length){
            char ch = chars[i];
            int count = 0;
            while(i<chars.length && chars[i] == ch){
                count++;
                i++;
            }
            chars[k++] = ch;
            if(count > 1){
                String s = String.valueOf(count);

                for(int j = 0;j<s.length();j++){
                    chars[k++] = s.charAt(j);
                }
            }
        }
        return k;
    }
}