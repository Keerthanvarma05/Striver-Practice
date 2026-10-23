package ArraysEasy;

import java.util.Scanner;

public class P3 {
    static boolean checkSorted1(int[] arr, int n) {
        if (n < 2)
        return true;
        for (int i = 1; i < n; i++) {
            if(arr[i] < arr[i-1]){
                return false;
            }
        }
        return true;
    }
    static boolean checkSorted2(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[i]) {
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        boolean result = checkSorted2(arr, n);
        System.out.println("Array sort status: "+result);
    }
}
