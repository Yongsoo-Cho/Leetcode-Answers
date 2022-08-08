class Solution {
    public int countBattleships(char[][] board) {
        int res = 0;

        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[i].length;j++){
                if(board[i][j]=='X'){
                    res++;
                    dfs(i, j, board);
                }
            }
        }

        return res;
    }

    private void dfs(int i, int j, char[][] board){
        if(i>=0 && i<board.length && j>=0 && j<board[i].length && board[i][j]=='X'){
            board[i][j] = '.';
            dfs(i+1, j, board);
            dfs(i-1, j, board);
            dfs(i, j+1, board);
            dfs(i, j-1, board);
            return;
        }
    }
}
