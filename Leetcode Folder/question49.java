class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<String, List<String>>();

        for(String s: strs){
            char[] characters = s.toCharArray();
            Arrays.sort(characters);
            String keyString = String.valueOf(characters);

            if(!map.containsKey(keyString)){
                map.put(keyString, new ArrayList<>());
            }

            map.get(keyString).add(s);
        }


        return new ArrayList<>(map.values());
    }
}
