package Sortings;

import java.util.Scanner;

public class SelectionSort {
    static void selectionSort(int[] arr,int n){
        for(int i=0;i<n-1;i++){  /*if i=1,min=1,j=2,arr[j]<arr[min]*/
            int min=i;
            for(int j=i+1;j<n;j++) {
                if (arr[j] < arr[min]) {
                    min = j;//finds the min of all the array
                }
            }
            //dry run loop
            for(int k=0;k<n;k++){
                System.out.print(arr[k]+" ");
            }
            System.out.println();
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;//swaps with ar[i]=0,1,2,3,4..n-1
        }
        System.out.println("Final Array: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        selectionSort(arr,n);
    }
}
