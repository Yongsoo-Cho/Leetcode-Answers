class Solution {
    public String[] findWords(String[] words) {
        HashMap<Character, String> map = new HashMap<Character, String>();

        ArrayList<String> rows = new ArrayList<>();
        rows.add("QWERTYUIOP");
        rows.add("ASDFGHJKL");
        rows.add("ZXCVBNM");
        for(String s: rows){
            for(int i=0; i<s.length(); i++){
                char c = s.charAt(i);

                map.put(c, s);
                map.put( Character.toLowerCase(c), s );
            }
        }

        ArrayList<String> res = new ArrayList<>();
        for(String word: words){
            boolean flag = false;
            String checkRow = map.get(word.charAt(0)); //represents a row

            for(int i=0; i<word.length(); i++){
                char charAtRow = word.charAt(i);

                if(!map.get(charAtRow).equals(checkRow)){
                    flag = true;
                    break;
                }
            }

            if(flag==false){
                res.add(word);
            }
        }

        return res.toArray(new String[res.size()]);
    }
}
