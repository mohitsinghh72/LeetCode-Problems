class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> list = new ArrayList<>();
        if(digits.isEmpty()){
            return list;
        }
        combination(digits,0,new StringBuilder(),list);
        return list;
    }
    private void combination(String digits,int i,StringBuilder sb,List<String> list){
        if(i == digits.length()){
            list.add(sb.toString());
            return;
        }
        char ch = digits.charAt(i);
        String letters = getAlpha(ch);

        for(int ind = 0;ind<letters.length();ind++){
            sb.append(letters.charAt(ind));
            combination(digits,i+1,sb,list);
            sb.deleteCharAt(sb.length()-1);
        }
    }
    private String getAlpha(char ch) {
        switch (ch) {
            case '2': return "abc";
            case '3': return "def";
            case '4': return "ghi";
            case '5': return "jkl";
            case '6': return "mno";
            case '7': return "pqrs";
            case '8': return "tuv";
            case '9': return "wxyz";
            default: return "";
        }
    }
}