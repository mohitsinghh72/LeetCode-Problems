class Pair implements Comparable<Pair>{
    int ele;
    int cnt;

    Pair(int ele,int cnt){
        this.ele = ele;
        this.cnt = cnt;
    }

    public int compareTo(Pair p) {
        if (this.cnt == p.cnt) {
            return Integer.compare(this.ele, p.ele);
        }
        return Integer.compare(this.cnt, p.cnt);
    }
}
class Solution {

    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> mp = new HashMap<>();

        for(int i = 0;i<nums.length;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        for(int ele : mp.keySet()){
            int freq = mp.get(ele);
            pq.offer(new Pair(ele,freq));

            if(pq.size() > k){
                pq.poll();
            }
        }
        int[] ans = new int[k];

        for(int i = 0;i<ans.length;i++){
            Pair p = pq.poll();
            ans[i] = p.ele;
        }
        return ans;
    }
}