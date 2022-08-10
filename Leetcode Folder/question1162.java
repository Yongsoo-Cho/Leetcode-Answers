class Solution {
    public int maxDistance(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int max_d = -1;

        if(grid==null || rows==0 || cols==0){
            return -1;
        }

        Queue<int[]> q = new LinkedList<>();
        int[][] directions = new int[][]{{1,0},{-1,0},{0,1},{0,-1}};
        boolean[][] visited = new boolean[rows][cols];

        //do not visit land tiles
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(grid[i][j]==1){
                    visited[i][j]=true;
                    q.add(new int[]{i,j});
                }
            }
        }

        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0; i<size; i++){
                int[] current = q.remove();

                for(int[] d: directions){
                    int nextX = current[0]+d[0];
                    int nextY = current[1]+d[1];
                    if(nextX<0 || nextX>=rows || nextY<0 || nextY>=cols || visited[nextX][nextY]){
                        continue;
                    }
                    visited[nextX][nextY] = true;
                    q.add(new int[]{nextX, nextY});
                }
            }
            max_d++;
        }

        return max_d==0 ? -1 : max_d;
    }
}
