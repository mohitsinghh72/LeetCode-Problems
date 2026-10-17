class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> st = new Stack<>();

        for(char ch : num.toCharArray()){
            while(!st.isEmpty() && k > 0 && st.peek() > ch){
                st.pop();
                k--;
            }
            st.push(ch);
        }
        while(k > 0){
            st.pop();
            k--;
        }
        StringBuilder sb = new StringBuilder();
        for(char ch : st){
            if(sb.length() > 0|| ch!='0'){
                sb.append(ch);
            }
        }
        return sb.length() == 0 ? "0" : sb.toString();
    }
}