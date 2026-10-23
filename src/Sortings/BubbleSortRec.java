package Sortings;

import java.util.Scanner;

public class BubbleSortRec {
    //bruteforce
    static void bubbleSort(int[] arr, int n) {
        // Base case: array of size 1 is already sorted
        if (n == 1) return;
        // Push the largest element to the end
        for (int j = 0; j < n - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                // Swap arr[j] and arr[j + 1]
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
        // Recurse for the remaining unsorted array
        bubbleSort(arr, n - 1);
    }
    //optimal
    static void bubbleSort1(int[] arr, int n) {
        // Base case
        if (n == 1) return;
        boolean didSwap = false; // Track if any swap occurred
        // Perform one pass of bubble sort
        for (int j = 0; j < n - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                // Swap arr[j] and arr[j + 1]
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
                didSwap = true;
            }
        }
        // If no swaps were made, the array is already sorted
        if (!didSwap) return;
        // Recur for remaining elements
        bubbleSort1(arr, n - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        bubbleSort1(arr, n);
        for(int j=0;j<n;j++) {
            System.out.print(arr[j] + " ");
        }
    }
}
