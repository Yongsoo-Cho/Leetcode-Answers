class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num: nums){ map.put(num, map.getOrDefault(num, 0)+1); }

        PriorityQueue<Integer> heap = new PriorityQueue<>((a,b) -> b.getValue() - a.getValue());
        heap.addAll(map.entrySet());

        ArrayList<Integer> res = new ArrayList<>();
        for(int i=0; i<k; i++){ res.add(heap.poll().getKey()); }

        return res;
    }
}
