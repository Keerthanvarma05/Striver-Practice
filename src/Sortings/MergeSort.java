package Sortings;

import java.util.ArrayList;
import java.util.Scanner;

public class MergeSort {
    public static void merge(int arr[],int low,int mid,int high){
        ArrayList<Integer> list = new ArrayList<Integer>();
        int left=low;
        int right=mid+1;
        while(left<=mid&&right<=high){
            if(arr[left]<=arr[right]){
                list.add(arr[left]);
                left++;
            }
            else{
                list.add(arr[right]);
                right++;
            }
        }
        while(left<=mid){
            list.add(arr[left]);
            left++;
        }
        while(right<=high){
            list.add(arr[right]);
            right++;
        }
        for(int i=0;i<list.size();i++){
            arr[low+i]=list.get(i);//remember arr[] is not starting from zero it stores sorted freshly for each recursion
        }
    }
    public static void mergeSort(int[] arr,int low, int high){
        if(low>=high) return;
        int mid = (low+high)/2;
        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);
        merge(arr,low,mid,high);
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        mergeSort(arr,0,n-1);
        System.out.println("The sorted array is: ");
        for (int i : arr) System.out.print(i+" ");
    }
}
