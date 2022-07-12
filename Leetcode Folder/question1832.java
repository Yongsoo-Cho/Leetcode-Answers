class Solution {
    public boolean checkIfPangram(String sentence) {
        Set<Character> set = new HashSet<Character> ();

        for (char a: sentence.toCharArray()){
            set.add(a);
        }

        return set.size() == 26;

    }
}
