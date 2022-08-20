class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        Map<String, Integer> map = new HashMap<>();

        for(String words: (s1+" "+s2).split(" ")){
            map.put(words, map.getOrDefault(words, 0)+1);
        }

        ArrayList<String> res = new ArrayList<>();

        for(String words: map.keySet()){
            if(map.get(words)==1){
                res.add(words);
            }
        }

        return res.toArray(new String[0]);
    }
}
