package Sortings;

import java.util.Scanner;

public class InsertionSort {
    static void insertionSort(int[] arr,int n) {
        for (int i=0;i<n;i++) {
            int j=i;
            while(j>0 && arr[j-1]>arr[j]) {
                int temp=arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
                j--;
                //dry run loop
                for(int k=0;k<n;k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
        }
        System.out.println("Final Array: ");
        for(int i=0;i<n;i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
        }
        insertionSort(arr,n);
    }
}
