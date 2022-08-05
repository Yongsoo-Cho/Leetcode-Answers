class Solution {
    public int numIslands(char[][] grid) {
        int res = 0;

        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[i].length; j++){
                if(grid[i][j] == '1'){
                    dfs(i, j, grid);
                    res++;
                }
            }
        }
        return res;
    }

    public void dfs(int i, int j, char[][] grid){
        if(i<0 || i>=grid.length || j<0 || j>=grid[i].length || grid[i][j]=='0') return;

        grid[i][j] = '0';

        //left
        dfs(i, j+1, grid);
        //right
        dfs(i, j-1, grid);
        //up
        dfs(i+1, j, grid);
        //down
        dfs(i-1, j, grid);
    }
}
