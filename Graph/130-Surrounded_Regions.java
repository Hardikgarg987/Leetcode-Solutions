class Solution {
    public void dfs(char [][]arr, int vis[][], int i, int j, int dx[], int dy[]){
        vis[i][j] = 1;
        int n = arr.length;
        int m = arr[0].length;
        for(int t = 0; t < 4;t++){
            int row = i + dx[t];
            int col = j + dy[t];
            if(row >= 0 && col >= 0 && row < n && col < m){
                if(arr[row][col] == 'O' && vis[row][col] == 0){
                    dfs(arr, vis, row, col, dx, dy);
                }
            }
        }
    }
    public void solve(char[][] board) {
        int n = board.length;
        int m = board[0].length;
        int vis[][] = new int[n][m];
        int dx[] = {1, 0, -1, 0};
        int dy[] = {0, 1, 0, -1};
        for(int i = 0;i < m;i++){
            if(vis[0][i] == 0 && board[0][i] == 'O'){
                dfs(board, vis, 0, i, dx, dy);
            }
            if(vis[n-1][i] == 0 && board[n-1][i] == 'O'){
                dfs(board, vis, n-1, i,dx , dy);
            }
        }

        for(int i = 0;i < n;i++){
            if(vis[i][0] == 0 && board[i][0] == 'O'){
                dfs(board, vis, i, 0, dx, dy);
            }

            if(vis[i][m-1] == 0 && board[i][m-1] == 'O'){
                dfs(board, vis, i, m-1, dx, dy);
            }
        }

        for(int i = 0;i < n;i++){
            for(int j = 0;j < m;j++){
                if(vis[i][j] == 1){
                    board[i][j] = 'O';
                }else{
                    board[i][j] = 'X';
                }
            }
        }
    }
}