package ArraysMedium;

import java.util.Arrays;
import java.util.Scanner;

public class P7 {
    static int[] nextGreaterPermutation(int[] A) {
            int ind = -1;
            int n = A.length;
            // Step 1: Find the first decreasing element from the right
            for (int i = n - 2; i >= 0; i--) {
                if (A[i] < A[i + 1]) {
                    ind = i;
                    break;
                }
            }
            // Step 2: If no decreasing element is found,
            // this is the last permutation
            if (ind == -1) {
                reverse(A, 0, n - 1);
                return A;
            }
            // Step 3: Find the smallest element greater than A[ind]
            // from the right side
            for (int i = n - 1; i > ind; i--) {
                if (A[i] > A[ind]) {
                    int temp = A[i];
                    A[i] = A[ind];
                    A[ind] = temp;
                    break;
                }
            }
            // Step 4: Reverse the part after ind
            reverse(A, ind + 1, n - 1);
            return A;
        }
        static void reverse(int[] A, int start, int end) {
            while (start < end) {
                int temp = A[start];
                A[start] = A[end];
                A[end] = temp;

                start++;
                end--;
            }
        }
        public static void main(String[] args) {
            int[] A = {1, 2, 3};
            nextGreaterPermutation(A);
            System.out.println(Arrays.toString(A));
            int[] A1 = {3, 1, 2};
            nextGreaterPermutation(A);
            System.out.println(Arrays.toString(A1));
            int[] A2 = {2,1,5,4,3,0,0};
            nextGreaterPermutation(A2);
            System.out.println(Arrays.toString(A2));
        }
}