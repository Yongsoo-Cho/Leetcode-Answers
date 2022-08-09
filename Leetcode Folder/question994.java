class Solution {
    public int orangesRotting(int[][] grid) {
        LinkedList<int[]> queue = new LinkedList<>(); //coord point

        int rows = grid.length;
        int cols = grid[0].length;
        int minutes = 0;


        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(grid[i][j]==2){
                    queue.add(new int[]{i,j});
                }
            }
        }

        int[][] directions = {{1,0}, {-1,0}, {0,1}, {0,-1}};

        while(!queue.isEmpty()){
            int size = queue.size();

            for(int i=0; i<size; i++){
                int[] coord = queue.remove();

                for(int[] d: directions){
                    int nextX = coord[0]+d[0];
                    int nextY = coord[1]+d[1];

                    if(nextX<0 || nextX>=rows || nextY<0 || nextY>=cols || grid[nextX][nextY]!=1) continue;

                    queue.add(new int[]{nextX, nextY});
                    grid[nextX][nextY] = 2;
                }
            }

            minutes++;
        }

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(grid[i][j]==1) return -1;
            }
        }


        return minutes==0 ? 0 : minutes-1;
    }
}
