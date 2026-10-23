package Sortings;

import java.util.Scanner;

public class QuickSort {
    public static int partitionIndex(int arr[],int low,int high){
        int pivot=arr[low];
        int i=low,j=high;
        while(i<j){
            while(i<=high&&arr[i]<=pivot){
                i++;
            }
            while(j>=low&&arr[j]>pivot){
                j--;
            }
            if(i<j) {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        arr[low]=arr[j]; //low which is stores j
        arr[j]=pivot; //j which stores pivot and arr[low] is initially pivot so gets replaced at j
        return j;
    }
    public static void qSort(int arr[],int low,int high){
        if(low<high){
            int pindex=partitionIndex(arr,low,high);
            qSort(arr,low,pindex-1);//for sorting ele less than pivot
            qSort(arr,pindex+1,high);//for sorting ele greater than pivot
        }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the array elements: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        qSort(arr,0,n-1);
        System.out.println("Sorted array: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
