package ArraysEasy;

import java.util.Scanner;

public class P2 {
    //Better version
    public static void secondLargest1(int[] arr,int n) {
        // Edge case: when the array has less than 2 elements
        if (n == 0 || n == 1) {
            System.out.println(-1 + " " + -1);  // Print -1 for both second smallest and second largest
            return;
        }
        // Initialize variables to track the smallest, second smallest, largest, and second largest elements
        int small = Integer.MAX_VALUE, second_small = Integer.MAX_VALUE;
        int large = Integer.MIN_VALUE, second_large = Integer.MIN_VALUE;

        // Find the smallest and largest elements in the array
        for (int i = 0; i < n; i++) {
            small = Math.min(small, arr[i]);  // Update the smallest element
            large = Math.max(large, arr[i]);  // Update the largest element
        }
        for (int i = 0; i < n; i++) {
            if(arr[i] < second_small&&arr[i] != small) {
                second_small = arr[i];
            }
            if(arr[i] > second_large&&arr[i] != large) {
                second_large = arr[i];
            }
        }
        System.out.println("2nd Largest number is: " + second_large);
        System.out.println("2nd Smallest number is: " + second_small);
    }
    //Optimal version
    public static int secondSmallest2(int[] arr, int n) {
        // Edge case: if the array has fewer than 2 elements
        if (n < 2)
            return -1;

        int small = Integer.MAX_VALUE;
        int second_small = Integer.MAX_VALUE;

        // Loop through the array to find the second smallest element
        for (int i = 0; i < n; i++) {
            // Update the smallest and second smallest values
            if (arr[i] < small) {
                small = arr[i];
                second_small = small;
            }
            else if(arr[i]<second_small&&arr[i]!=small) {
                second_small = arr[i];
            }
        }
        return second_small; // Return the second smallest element
    }

        // Function to find the second largest element in the array
    public static int secondLargest2(int[] arr, int n) {
        // Edge case: if the array has fewer than 2 elements
        if (n < 2)
            return -1;

        int large = Integer.MIN_VALUE, second_large = Integer.MIN_VALUE;

        // Loop through the array to find the second largest element
        for (int i = 0; i < n; i++) {
            // Update the largest and second largest values
            if (arr[i] > large) {
                second_large = large;
                large = arr[i];
            }
            else if (arr[i] > second_large && arr[i] != large) {
                second_large = arr[i];
            }
        }
        return second_large; // Return the second largest element
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++){
            ar[i]=sc.nextInt();
        }
        System.out.println("Second smallest: "+secondSmallest2(ar,n));
        System.out.println("Second largest: "+secondLargest2(ar,n));
    }
}
