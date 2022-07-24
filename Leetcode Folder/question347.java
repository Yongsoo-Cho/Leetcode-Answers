class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num: nums){ map.put(num, map.getOrDefault(num, 0)+1); }
        
        PriorityQueue<Map.Entry<Integer,Integer>> heap = new PriorityQueue<>((a,b) -> b.getValue() - a.getValue());
        heap.addAll(map.entrySet());
        
        ArrayList<Integer> resList = new ArrayList<>();
        for(int i=0; i<k; i++){ resList.add(heap.poll().getKey()); }
        
        int[] res = new int[resList.size()];
        
        for(int i=0; i<res.length; i++){
            res[i] = resList.get(i);
        }
        
        return res;
    }
}
