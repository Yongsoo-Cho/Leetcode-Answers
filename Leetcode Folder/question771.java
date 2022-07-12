class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> jewelType = new HashSet<Character>();
        int result = 0;

        for(char a: jewels.toCharArray()){
            jewelType.add(a);
        }

        for(char b: stones.toCharArray()){
            if (jewelType.contains(b)){
                result++;
            }
        }

        return result;

    }
}
