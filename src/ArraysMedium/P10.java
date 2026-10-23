package ArraysMedium;

public class P10 {
    //Set Matrix Zeros
    public static void markRow(int[][] arr,int i,int m){
        for(int j=0;j<m;j++){
            if(arr[i][j]!=0) arr[i][j]=-1;
        }
    }
    public static void markColumn(int[][] arr,int j,int n){
        for(int i=0;i<n;i++){
            if(arr[i][j]!=0) arr[i][j]=-1;
        }
    }
    //Brute Force
    public static void setMatrixZeros(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0) {
                    markRow(matrix,i,m);
                    markColumn(matrix,j,n);
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == -1) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
    // Better Approach
    public static void setMatrixZeros1(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int[] row = new int[n];
        int[] col = new int[m];
        // Step 1: Find all zero positions
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                if (matrix[i][j] == 0) {
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }
        // Step 2: Set corresponding rows and columns to zero
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                if (row[i] == 1 || col[j] == 1) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
    //Optimal
    public static void setMatrixZeros2(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        // matrix[0][0] is used for both:
        // first row and first column
        // So we need a separate variable for first column.
        int col0 = 1;
        // Step 1: Mark rows and columns
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0) {
                    // Mark the i-th row
                    matrix[i][0] = 0;
                    // Mark the j-th column
                    if (j != 0) {
                        matrix[0][j] = 0;
                    } else {
                        col0 = 0;
                    }
                }
            }
        }
        // Step 2: Set inner matrix elements to zero
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (matrix[i][j] != 0) {
                    // Check whether its row or column was marked
                    if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                        matrix[i][j] = 0;
                    }
                }
            }
        }
        // Step 3: Handle first row
        if (matrix[0][0] == 0) {
            for (int j = 0; j < m; j++) {
                matrix[0][j] = 0;
            }
        }
        // Step 4: Handle first column
        if (col0 == 0) {
            for (int i = 0; i < n; i++) {
                matrix[i][0] = 0;
            }
        }
    }

    public static void main(String[] args) {
        int [][]arr= {{1,1,1,1},{1,0,0,1},{1,1,0,1},{1,1,1,1}};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        /*System.out.println("After: ");
        setMatrixZeros(arr);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Better: ");
        setMatrixZeros1(arr);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }*/
        System.out.println("Optimal: ");
        setMatrixZeros2(arr);
        for(int i=0;i<arr.length;i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
