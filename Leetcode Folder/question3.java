class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start = 0;
        int max = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            if(map.containsKey(s.charAt(i)) && map.get(s.charAt(i))>=start){
                start = map.get(s.charAt(i))+1;
            }

            map.put(s.charAt(i), i);

            max = Math.max(max, i-start+1);
        }

        return max;
    }
}
