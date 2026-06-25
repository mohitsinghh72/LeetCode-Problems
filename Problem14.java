class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0){
            return "";
        }
        String temp = strs[0];

        for(int i = 0;i<strs.length;i++){
            StringBuilder sb = new StringBuilder();
            int len = Math.min(temp.length(),strs[i].length());
            for(int j = 0;j<len;j++){
                if(strs[i].charAt(j) == temp.charAt(j)){
                    sb.append(strs[i].charAt(j));
                }else{
                    break;
                }
            }
            temp = sb.toString();
        }
        if(temp.isEmpty()){
            return "";
        }
        return temp;
    }
}