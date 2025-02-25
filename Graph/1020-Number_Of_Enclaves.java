class Solution {
    public void dfs(int[][] arr, int[][] vis, int i, int j, int[] dx, int[] dy) {
        vis[i][j] = 1;
        int n = arr.length;
        int m = arr[0].length;
        for (int t = 0; t < 4; t++) {
            int row = i + dx[t];
            int col = j + dy[t];
            if (row >= 0 && col >= 0 && row < n && col < m && arr[row][col] == 1 && vis[row][col] == 0) {
                dfs(arr, vis, row, col, dx, dy);
            }
        }
    }

    public int numEnclaves(int[][] board) {
        int n = board.length;
        int m = board[0].length;
        int[][] vis = new int[n][m];
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};

        for (int i = 0; i < n; i++) {
            if (board[i][0] == 1 && vis[i][0] == 0) {
                dfs(board, vis, i, 0, dx, dy);
            }
            if (board[i][m - 1] == 1 && vis[i][m - 1] == 0) {
                dfs(board, vis, i, m - 1, dx, dy);
            }
        }

        for (int i = 0; i < m; i++) {
            if (board[0][i] == 1 && vis[0][i] == 0) {
                dfs(board, vis, 0, i, dx, dy);
            }
            if (board[n - 1][i] == 1 && vis[n - 1][i] == 0) {
                dfs(board, vis, n - 1, i, dx, dy);
            }
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (board[i][j] == 1 && vis[i][j] == 0) {
                    count++;
                }
            }
        }
        return count;
    }
}
