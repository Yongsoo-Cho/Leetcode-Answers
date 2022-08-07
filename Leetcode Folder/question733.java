class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int oldColor = image[sr][sc];
        dfs(oldColor, color, image, sr, sc);
        return image;
    }
    private void dfs(int oldColor, int color, int[][] image, int sr, int sc){
        if(sr<0||sc<0||sr>=image.length||sc>=image[sr].length||color==oldColor||image[sr][sc]!=oldColor){
            return;
        }
        image[sr][sc] = color;

        dfs(oldColor, color, image, sr+1, sc);
        dfs(oldColor, color, image, sr-1, sc);
        dfs(oldColor, color, image, sr, sc+1);
        dfs(oldColor, color, image, sr, sc-1);
        return;

    }
}
