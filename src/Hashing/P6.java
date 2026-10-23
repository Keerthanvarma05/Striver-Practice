package Hashing;

import java.util.HashMap;
import java.util.Scanner;

public class P6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        int ar[] = new int[n];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (map.containsKey(ar[i])) {
                map.put(ar[i], map.get(ar[i]) + 1);
            } else {
                map.put(ar[i], 1);//stores array value as key and 1 as value
            }
        }
        System.out.println("Enter no.of search elements: ");
        int q = sc.nextInt();
        while (q-- > 0) {
            System.out.println("Enter element to search: ");
            int k = sc.nextInt();
            System.out.println("if k exists in array: "+map.containsKey(k));
            System.out.println("Frequency of element: " +map.get(k));
        }
    }
}