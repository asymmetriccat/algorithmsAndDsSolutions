package algorithms;

public class SetMatrixZeroes {
    public void setZeroes(int[][] matrix) {
        boolean zeroInFirstRow=false;
        boolean zeroInFirstColumn=false;
        int r=matrix.length;
        int c=matrix[0].length;
        for(int i=0; i<r; i++){
            if(matrix[i][0]==0) {
                zeroInFirstRow=true;
                break;
            }
        }
        for(int j=0; j<c; j++){
            if(matrix[0][j]==0) {
                zeroInFirstColumn=true;
                break;
            }
        }

        for(int i=1; i<r; i++){
            for(int j=1;j<c; j++){
                if(matrix[i][j]==0) {
                    matrix[0][j]=0;
                    matrix[i][0]=0;
                }
            }
        }

        for(int i=1; i<r; i++){
            if(matrix[i][0]==0) {
                for(int j=1; j<c;j++){
                    matrix[i][j]=0;
                }
            }
        }
        for(int j=1; j<c; j++){
            if(matrix[0][j]==0) {
                for(int i=1; i<r; i++){
                    matrix[i][j]=0;
                }
            }
        }

        if(zeroInFirstRow){
            for(int i=0; i<c; i++){
                matrix[0][i]=0;
            }
        }
        if(zeroInFirstColumn){
            for(int i=0; i<r; i++){
                matrix[i][0]=0;
            }
        }


        }
    public static void main(String args[]){
        SetMatrixZeroes setMatrixZeroes = new SetMatrixZeroes();
        int [][] ints = new int[][]{{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        setMatrixZeroes.setZeroes(ints);

}
}
