class Solution {
    public char findTheDifference(String s, String t) {
        Map<Character, Integer> sMap = new HashMap<Character, Integer>();

        //initialize string s into map
        for(char c: s.toCharArray()){
            sMap.put(c, sMap.getOrDefault(c,0)+1);
        }
        //subtract string t from string s.
        for(char c: t.toCharArray()){
            sMap.put(c, sMap.getOrDefault(c,0)-1);
        }
        for (char c: sMap.keySet()){
            if (sMap.get(c) != 0){
                return c;
            }
        }

        return ' ';
    }
}

//MAP OF STRING S: On Map Init (String S)
//A -> (A,0+1)
//D -> (D, 0+1)
//D -> (D, 1+1)
//E -> (E, 0+1)
//MAP OF STRING: On Subtract (String T)
//A -> (A, 1-1)
//D -> (D, 2-1)
//D -> (D, 1-1)
//E -> (E, 1-1)
//B -> (B, 0-1)
// B HAS VALUE != 0
