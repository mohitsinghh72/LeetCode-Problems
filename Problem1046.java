class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        if(stones.length == 0){
            return -1;
        }
        if(stones.length < 2){
            return stones[0];
        }
        for (int num : stones) {
            pq.offer(num);
        }
        while(pq.size()  > 1){
            int first = pq.poll();
            int second = pq.poll();
            if (first != second) {
                pq.offer(first - second);
            }
        }
        return pq.isEmpty() ? 0:pq.peek();
    }
}