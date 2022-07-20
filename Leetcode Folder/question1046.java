class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());
        for(int stone: stones){
            heap.add(stone);
        }

        while(heap.size()!=1){
            int heaviest = heap.poll();
            int secondHeaviest = heap.poll();

            heap.add(heaviest - secondHeaviest);
        }

        return heap.poll();
    }
}
