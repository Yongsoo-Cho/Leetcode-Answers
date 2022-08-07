class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int res = 0;

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(grid[i][j]==1){
                    res = Math.max(res, dfs(i, j, grid));
                }
            }
        }

        return res;
    }


    private int dfs(int i, int j, int[][] grid) {
        if(i>=0 && i<=grid.length-1 && j>=0 && j<=grid[0].length-1 && grid[i][j]==1){
            grid[i][j]=0;

            return 1+dfs(i+1, j, grid)+dfs(i-1, j, grid)+dfs(i, j+1, grid)+dfs(i, j-1, grid);

        }
        return 0;
    }

}
