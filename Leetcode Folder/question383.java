class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length()>magazine.length()){
            return false;
        }

        HashMap<Character, Integer> map = new HashMap<Character, Integer>();

        for(char c: magazine.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }

        for(char c: ransomNote.toCharArray()){
            if(map.getOrDefault(c,0)-1<0){
                return false;
            }

            map.put(c, map.getOrDefault(c,0)-1);
        }

        return true;
    }
}

//INPUT aa aab
//map
//a -> (a,0+1) 1
//a -> (a,1+1) 2
//b -> (b, 0+1) 1
//map next
//a -> (a, 2-1) 1
//a -> (a, 1-1) 0
