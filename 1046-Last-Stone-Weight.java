class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for (int s: stones) {
            queue.add(s);
        }
        while (queue.size() > 1) {
            int stone1 = queue.poll();
            int stone2 = queue.poll();
            if (stone1 > stone2) {
                queue.add(stone1 - stone2);
            }
        }
        queue.add(0);
        return queue.peek();
    }
}