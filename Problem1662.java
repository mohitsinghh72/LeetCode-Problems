class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder();

        int i = 0;
        int j = 0;

        while(i<word1.length && j<word2.length){
            str1 = str1.append(word1[i]);
            str2 = str2.append(word2[j]);
            i++;
            j++;
        }

        while(i<word1.length){
            str1 = str1.append(word1[i]);
            i++;
        }
        while(j<word2.length){
            str2 = str2.append(word2[j]);
            j++;
        }
        if(str1.toString().contentEquals(str2.toString())){
            return true;
        }else{
            return false;
        }
    }
}