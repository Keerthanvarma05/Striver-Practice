package ArraysMedium;

import java.util.Scanner;

public class P12 {
    //Spiral matrix
    public static void spiralMatrix(int arr[][]){
        int n = arr.length;
        int m = arr[0].length;
        int top = 0;
        int bottom = n-1;
        int left = 0;
        int right = m-1;
        //flow of spiral left->right,top->bottom,right->left,bottom->top then loop again
        while(top<=bottom && left<=right){
            for(int i = left; i <= right; i++){
                System.out.print(arr[top][i]+" ");
            }
            top++;
            for(int i = top; i <= bottom; i++){
                System.out.print(arr[i][right]+" ");
            }
            right--;
            if(top<=bottom) {
                for (int i = right; i >= left; i--) {
                    System.out.print(arr[bottom][i]+" ");
                }
                bottom--;
                for (int i = bottom; i >= top; i--) {
                    System.out.print(arr[i][left]+" ");
                }
                left++;
            }
        }
    }
    public static void main(String args[]){
        int [][]arr={{1,2,3},{4,5,6},{7,8,9}};
        for(int j=0;j<arr.length;j++){
            for(int k=0;k<arr[j].length;k++){
                System.out.print(arr[j][k]+" ");
            }
            System.out.println();
        }
        spiralMatrix(arr);
    }
}
