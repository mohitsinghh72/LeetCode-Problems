class Solution {
    public String reverseVowels(String s) {
        char[] temp = s.toCharArray();

        int i = 0;
        int j = temp.length-1;

        while(i<j){
            while(i<j && !(temp[i] == 'a' || temp[i] == 'e' || temp[i] == 'i' || temp[i] == 'o' || temp[i] == 'u' || temp[i] == 'A' || temp[i] == 'E' || temp[i] == 'I' || temp[i] == 'O' || temp[i] == 'U')){
                i++;
            }
            while(i<j && !(temp[j] == 'a' || temp[j] == 'e' || temp[j] == 'i' || temp[j] == 'o' || temp[j] == 'u' || temp[j] == 'A' || temp[j] == 'E' || temp[j] == 'I' || temp[j] == 'O' || temp[j] == 'U')){
                j--;
            }
            char temp1 = temp[i];
            temp[i] = temp[j];
            temp[j] = temp1;
            i++;
            j--;
        }

        StringBuilder str = new StringBuilder();
        for(char c : temp){
            str = str.append(c);
        }
        return str.toString();

    }
}