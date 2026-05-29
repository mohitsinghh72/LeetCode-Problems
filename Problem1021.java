class Solution {
    public String removeOuterParentheses(String s) {
        int counter = 0;
        StringBuilder ans = new StringBuilder();

        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) == '('){
                if(counter == 0){
                    counter++;
                }else{
                    ans = ans.append(s.charAt(i));
                    counter++;
                }
            }else{
                if(counter > 1){
                    ans = ans.append(s.charAt(i));
                    counter--;
                }else{
                    counter--;
                }
            }
        }
        return ans.toString();
    }
}