package algorithms;

public class UniquePaths2 {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length;
        int n = obstacleGrid[0].length;
        if(obstacleGrid==null || m ==0 || n ==0) return 0;

        int [][] paths = new int[m][n];
        for(int i=0; i<m; i++){
            if(obstacleGrid[i][0] !=1){
                paths[i][0]=1;
            }else break;

        }

        for(int j=0; j<n; j++){
            if(obstacleGrid[0][j] !=1){
                paths[0][j]=1;
            }
            else break;
        }

        for(int i=1; i<m; i++){
            for(int j=1; j<n; j++){
                if(obstacleGrid[i][j]!=1){
                    paths[i][j] = paths[i-1][j] + paths[i][j-1];
                }

            }
        }

        return paths[m-1][n-1];




    }
    public static void main(String args[]){
        UniquePaths2 uniquePaths2 = new UniquePaths2();
        int[][] ints = new int[][]{{1}};
        uniquePaths2.uniquePathsWithObstacles(ints);
    }
}
