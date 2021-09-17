class Solution {
    
    static int numberOfArea;
    static int maxSizeOfOneArea;
    static int cnt=0;
    static int[] dr = {-1,1,0,0};
    static int[] dc = {0,0,1,-1};
    
    public int[] solution(int m, int n, int[][] picture) {
        numberOfArea = 0;
        maxSizeOfOneArea = 0;
        int[] answer = new int[2];
        answer[0] = numberOfArea;
        answer[1] = maxSizeOfOneArea;
        
        
        boolean[][] check = new boolean[m][n];
        
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(picture[i][j] != 0 && !check[i][j]){
                    numberOfArea++;
                    dfs(i,j,picture,check);
                }
                if(cnt > maxSizeOfOneArea) {
                    maxSizeOfOneArea = cnt;
                }
                cnt=0;
            }
        }
        answer[0] = numberOfArea;
        answer[1] = maxSizeOfOneArea;
        return answer;
    }
    
    public static void dfs(int r, int c, int[][] picture, boolean[][] check){
        if(check[r][c]){
            return;
        }
        
        check[r][c] = true;
        cnt++;
        
        for(int i=0; i<4; i++){
            int nr = r + dr[i];
            int nc = c + dc[i];
            
            if(0<=nr && nr<picture.length && 0<=nc && nc<picture[0].length){
                if(picture[r][c] == picture[nr][nc] && !check[nr][nc]){
                    dfs(nr,nc,picture,check);
                }
            }
        }
    }
}