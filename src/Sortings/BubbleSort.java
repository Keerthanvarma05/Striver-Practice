package Sortings;

import java.util.Scanner;

public class BubbleSort {
    static void bubbleSort(int[] arr,int n) {       //consider arr={4,3,2,1}
        for(int i=n-1;i>0;i--) {//if n=4,i=3,j=0,arr[0]>arr[1]
            int didswap=0;
            for(int j=0;j<i;j++) {
                if (arr[j] > arr[j+1]) {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    didswap=1;
                }
                //dry run loop
                for(int k=0;k<n;k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
            if (didswap==0) break;
            else System.out.println("swaped");
        }
        System.out.println("Final Array: ");
        for(int j=0;j<n;j++) {
            System.out.print(arr[j]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
        }
        bubbleSort(arr,n);
    }
}
