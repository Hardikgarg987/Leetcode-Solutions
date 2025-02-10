class Solution {
    public void bfs(int [][]image, int sr,int sc, int color, int prevColor){
        if(sr < 0 || sr >= image.length || sc < 0 || sc >= image[0].length){
            return;
        }
        if(image[sr][sc] != prevColor || image[sr][sc] == color){
            return;
        }
        image[sr][sc] = color;
        bfs(image,sr+1,sc,color,prevColor);
        bfs(image,sr-1,sc,color,prevColor);
        bfs(image,sr,sc+1,color,prevColor);
        bfs(image,sr,sc-1,color,prevColor);
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        bfs(image, sr, sc, color, image[sr][sc]);
        return image;
    }
}