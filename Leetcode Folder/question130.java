class Solution {
    public void solve(char[][] board) {
        if(board.length==0) return;
        int rows = board.length;
        int columns = board[0].length;

        //rows
        for(int i=0; i<rows; i++){
            if(board[i][0] == 'O') dfs(i, 0, board);
            if(board[i][columns-1] == 'O') dfs(i, columns-1, board);
        }

        //columns
        for(int j=0; j<columns; j++){
            if(board[0][j]=='O') dfs(0, j, board);
            if(board[rows-1][j]=='O') dfs(rows-1, j, board);
        }

        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                if(board[i][j]=='.') board[i][j]='O';
                else board[i][j]='X';
            }
        }

        return;
    }

    private void dfs(int i, int j, char[][] board){
        if( i<0 || j<0 || i>=board.length || j>=board[0].length || board[i][j]=='.' || board[i][j]=='X') return;

        board[i][j] = '.';

        dfs(i-1, j, board);
        dfs(i+1, j, board);
        dfs(i, j-1, board);
        dfs(i, j+1, board);

        return;
    }
}
