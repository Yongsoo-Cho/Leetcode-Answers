class Solution {
    public int numEnclaves(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int res = 0;

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(i==0 || j==0 || i==rows-1 || j==cols-1) dfs(i, j, grid);
            }
        }

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(grid[i][j]==1) res++;
            }
        }

        return res;
    }

    private void dfs(int i, int j, int[][] grid){
        if(i>=0 && i<=grid.length-1 && j>=0 && j<=grid[0].length-1 && grid[i][j]==1){
            grid[i][j] = 0;

            dfs(i+1, j, grid);
            dfs(i-1, j, grid);
            dfs(i, j+1, grid);
            dfs(i, j-1, grid);
        }
    }
}
