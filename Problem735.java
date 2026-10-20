class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        List<Integer> list = new ArrayList<>();

        for(int i = 0;i<asteroids.length;i++){
            if(asteroids[i] > 0){
                list.add(asteroids[i]);
            }else{
                while(!list.isEmpty() && list.get(list.size()-1) > 0 && list.get(list.size()-1) < Math.abs(asteroids[i])){
                    list.remove(list.size()-1);
                }
                if(!list.isEmpty() && list.get(list.size()-1) == Math.abs(asteroids[i])){
                    list.remove(list.size()-1);
                }
                else if(list.isEmpty() || list.get(list.size()-1) < 0){
                    list.add(asteroids[i]);
                }
            }
        }
        int[] ans = new int[list.size()];
        for(int i = 0;i<ans.length;i++){
            ans[i] = list.get(i);
        }
        return ans;
    }
}