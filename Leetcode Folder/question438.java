class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int[] chars = new int[26];
        ArrayList<Integer> res = new ArrayList<>();

        for(char c: p.toCharArray()){
            chars[c-'a']++;
        }

        int start = 0;
        int end = 0;
        int count = p.length();

        while(end<s.length()){
            if(chars[s.charAt(end++)-'a']-- >= 1){ count--; }
            //move poitner while decrementing char bucket

            if(count==0){ res.add(start); }
            //when bucket is depleted add start position

            if(end-start==p.length() && chars[s.charAt(start++)-'a']++ >= 0){ count++; }
            //when characters are negative and a word has been depleted, refill the bucket
        }

        return res;
    }
}
