class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        HashSet<String> bannedWords = new HashSet<>(Arrays.asList(banned));
        HashMap<String, Integer> map = new HashMap<>();

        String[] words = paragraph.replaceAll("[!?',;.]", " ").replaceAll("  ", " ").toLowerCase().split(" ");

        for(String w: words){
            if(!bannedWords.contains(w)){
                map.put(w, map.getOrDefault(w, 0) + 1);
            }
        }

        String res = "";
        int max = 0;
        for(String s: map.keySet()){
            if(map.get(s)>max){
                max = map.get(s);
                res = s;
            }
        }

        return res;
    }
}
