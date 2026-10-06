class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        HashMap<String,Integer> mp = new HashMap<>();
        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        int right = 0;
        while(right < s.length()){
            sb.append(s.charAt(right));

            if(sb.length() > 10){
                sb.deleteCharAt(0);
            }
            if(sb.length() == 10){
                String sub = sb.toString();
                if(mp.containsKey(sub)){
                    if(mp.get(sub) == 1){
                        list.add(sub);
                    }
                    mp.put(sub,mp.get(sub)+1);
                }else{
                    mp.put(sub,1);
                }
            }
            right++;
        }
        return list;
    }
}