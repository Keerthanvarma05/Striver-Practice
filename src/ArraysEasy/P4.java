package ArraysEasy;
import java.util.HashSet;
import java.util.Arrays;
import java.util.Scanner;

public class P4 {
    //Optimal solution
    static int removeDuplicates(int[] arr) {
        // If array is empty, return 0
        if (arr.length == 0) return 0;

        // Pointer for last unique element
        int i = 0;

        // Start from second element
        for (int j = 1; j < arr.length; j++) {
            // If new unique element is found
            if (arr[j] != arr[i]) {
                // Move unique position forward
                i++;
                // Place new unique element
                arr[i] = arr[j];
            }
        }

        // i is last index of unique element, count = i + 1
        return i + 1;
    }
    static int removeDuplicates2(int[] arr) {
        // HashSet to store unique elements we have seen
        HashSet<Integer> seen = new HashSet<>();
        // Position to overwrite next unique element
        int index = 0;
        // Loop over each number in nums
        for (int num : arr) {
            // If num is not in the set, it is unique
            if (!seen.contains(num)) {
                // Add num to the set
                seen.add(num);
                // Write num at current index position
                arr[index] = num;
                // Move index forward
                index++;
            }
        }
        // Return number of unique elements
        return index;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        Arrays.sort(arr);
        int k=removeDuplicates2(arr);
        System.out.println("After removing duplicates: ");
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
