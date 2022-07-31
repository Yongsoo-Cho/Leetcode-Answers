class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int happy_children = 0;
        Arrays.sort(g); //greed values
        Arrays.sort(s); //satiety values

        for(int cookies=0; happy_children<g.length && cookies<s.length; cookies++){
            if(g[happy_children]<=s[cookies]){
                happy_children++;
            }
        }

        return happy_children;
    }
}
