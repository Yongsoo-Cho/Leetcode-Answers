class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        if(grid[0][0]!=0){
            return -1;
        }

        int rows = grid.length;
        int cols = grid[0].length;
        int numberOfMoves = 1;

        boolean[][] visited = new boolean[rows][cols];
        int[][] directions = {{-1,-1},{-1,0},{-1,1},{0,-1},{0,1},{1,-1},{1,0},{1,1}};
        Queue<int[]> queue = new LinkedList<>();

        queue.add(new int[]{0,0});
        while(!queue.isEmpty()){
            int size = queue.size();

            for(int i=0; i<size; i++){
                int[] currentPoint = queue.remove();
                if(currentPoint[0]==rows-1 && currentPoint[1]==cols-1){
                    return numberOfMoves;
                }

                for(int[] d: directions){
                    int nextX = currentPoint[0]+d[0];
                    int nextY = currentPoint[1]+d[1];

                    if(nextX<0 || nextX>=rows || nextY<0 || nextY>=cols){
                        continue;
                    }

                    if(visited[nextX][nextY] || grid[nextX][nextY]==1){
                        continue;
                    }
                    visited[nextX][nextY]=true;
                    queue.add(new int[]{nextX, nextY});
                }
            }
            numberOfMoves++;
        }


        return -1;
    }
}
