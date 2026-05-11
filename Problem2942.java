class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {

        List<Integer> ans = new ArrayList<>();

        for(int i = 0;i<words.length;i++){

            int j = 0;
            while(j<words[i].length()){
                char ch = words[i].charAt(j);
                if(ch == x){
                    ans.add(i);
                    break;
                }
                j++;
            }
        }
        return ans;

    }
}