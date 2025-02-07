class Solution {
    public static void dfs(int [][]graph, int visited[], int node){
        if(visited[node] == 1){
            return;
        }

        visited[node] = 1;
        for(int i = 0;i < graph.length;i++){
            if(graph[node][i] == 1 && visited[i] == 0 && i != node){
                dfs(graph, visited, i);
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        int count = 0;
        int visited[] = new int[n];
        for(int i = 0;i < n;i++){
            if(visited[i] == 0){
                count++;
                dfs(isConnected, visited, i);
            }
        }
        return count;
    }
}