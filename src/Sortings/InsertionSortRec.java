package Sortings;

import java.util.Scanner;

public class InsertionSortRec {
    static void insertionSort(int[] arr, int i, int n) {
        // Base case
        if (i == n) return;
        int j = i;
        // Move the current element back until it's in the correct place
        while (j > 0 && arr[j - 1] > arr[j]) {
            // Swap arr[j] and arr[j-1]
            int temp = arr[j - 1];
            arr[j - 1] = arr[j];
            arr[j] = temp;
            j--;
        }
        // Recur for the next index
        insertionSort(arr, i + 1, n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        insertionSort(arr, 0, n - 1);
        for (int i = 0; i < n; i++) System.out.print(arr[i] + " ");
    }
}
