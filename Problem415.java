class Solution {
    public String addStrings(String num1, String num2) {
        char[] temp1 = num1.toCharArray();
        char[] temp2 = num2.toCharArray();
        ArrayList<Character> ans = new ArrayList<>();

        int carry = 0;
        int i = temp1.length-1;
        int j = temp2.length-1;
        int sum = 0;
        while(i>=0 && j>=0){
            sum = carry + (temp1[i]-'0') + (temp2[j]-'0');
            ans.add((char)(sum%10 + '0'));
            carry = sum/10;
            i--;j--;
        }

        while(i>=0){
            sum = carry + (temp1[i] - '0');
            ans.add((char) (sum%10 + '0'));
            carry = sum/10;
            i--;
        }
        while(j>=0){
            sum = carry + (temp2[j] - '0');
            ans.add((char) (sum%10 + '0'));
            carry = sum/10;
            j--;
        }
        if(carry > 0){
            ans.add((char)(carry + '0'));
        }
        i = ans.size()-1;
        StringBuilder sb = new StringBuilder();
        while(i>=0){
            sb.append(ans.get(i));
            i--;
        }

        return sb.toString();
    }
}