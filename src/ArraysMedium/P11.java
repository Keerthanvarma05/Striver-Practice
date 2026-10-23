package ArraysMedium;

public class P11 {
    //Rotate Matrix 90 degrees/ Rotate image
    public static void reverse(int arr[],int low,int high) {
        while(low<high){
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }
    //Brute Force
    public static int[][] rotateMatrix90(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int [][]arr=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[j][n-1-i]=matrix[i][j];
            }
        }
        return arr;
    }
    //Optimal Solution
    public static void rotateMatrix(int[][] matrix) {
        int n = matrix.length;
        for(int i = 0; i <n; i++){
            for(int j = i+1; j < n; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for(int i = 0; i <n; i++){
            reverse(matrix[i],0,n-1);
        }
    }
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        for(int j=0;j<arr.length;j++){
            for(int k=0;k<arr[j].length;k++) {
                System.out.print(arr[j][k] + " ");
            }
            System.out.println();
        }
        System.out.println("After: ");
        /*
        int [][]ans=rotateMatrix90(arr);
        for(int j=0;j<ans.length;j++) {
            for(int k=0;k<ans[j].length;k++) {
                System.out.print(ans[j][k] + " ");
            }
            System.out.println();
        }*/
        rotateMatrix(arr);
        for(int j=0;j<arr.length;j++){
            for(int k=0;k<arr[j].length;k++) {
                System.out.print(arr[j][k] + " ");
            }
            System.out.println();
        }
    }
}
