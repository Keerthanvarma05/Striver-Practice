package ArraysEasy;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class P13 {
    //brute force
    static int solve(int[] a) {
        // store best length found so far
        int maxLen = 0;
        // map prefix sum -> first index seen
        Map<Integer, Integer> sumIndexMap = new HashMap<>();
        // running prefix sum
        int sum = 0;
        // iterate through the array
        for (int i = 0; i < a.length; i++) {
            // update running sum
            sum += a[i];
            // if sum is zero, subarray [0..i] has zero sum
            if (sum == 0) {
                // update best length
                maxLen = i + 1;
            }
            // if this sum seen before, subarray (prevIndex..i] has zero sum
            else if (sumIndexMap.containsKey(sum)) {
                // maximize length using previous index
                maxLen = Math.max(maxLen, i - sumIndexMap.get(sum));
            }
            // first time seeing this sum, store its index
            else {
                sumIndexMap.put(sum, i);
            }
        }
        // return best length
        return maxLen;
    }
    //optimal
    static int maxLen(int[] A, int n) {
        // map prefix sum -> first index seen
        Map<Integer, Integer> mpp = new HashMap<>();
        // best length so far
        int maxi = 0;
        // running prefix sum
        int sum = 0;
        // iterate over the array
        for (int i = 0; i < n; i++) {
            // update running sum
            sum += A[i];
            // if sum is zero, subarray [0..i] has zero sum
            if (sum == 0) {
                // update best length
                maxi = i + 1;
            }
            // otherwise check if this sum was seen before
            else {
                // when seen, zero-sum segment between previous index + 1 and i
                if (mpp.containsKey(sum)) {
                    // maximize length
                    maxi = Math.max(maxi, i - mpp.get(sum));
                }
                // first time seeing this sum
                else {
                    // record index
                    mpp.put(sum, i);
                }
            }
        }
        // return best length
        return maxi;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        int k = in.nextInt();
        int result=maxLen(a, n);
        System.out.println("Length of maxsubarray with both + and -: "+result);
    }
}
