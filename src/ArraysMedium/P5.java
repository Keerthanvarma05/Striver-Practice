package ArraysMedium;

import java.util.Scanner;

public class P5 {
    public static int maxSubArray(int[] nums) {
        // Maximum sum
        long maxi = Long.MIN_VALUE;
        // Current sum of subarray
        long sum = 0;
        // Starting index of current subarray
        int start = 0;
        // Indices of the maximum sum subarray
        int ansStart = -1, ansEnd = -1;
        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            // Update starting index if sum is reset
            if (sum == 0) {
                start = i;
            }
            // Add current element to the sum
            sum += nums[i];
            // Update maxi and subarray indices if current sum is greater
            if (sum > maxi) {
                maxi = sum;
                ansStart = start;
                ansEnd = i;
            }
            // Reset sum to 0 if it becomes negative
            if (sum < 0) {
                sum = 0;
            }
        }
        // Printing the subarray
        System.out.print("The subarray is: [");
        for (int i = ansStart; i <= ansEnd; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println("]");

        // Return the maximum subarray sum found
        return (int) maxi;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n=sc.nextInt();
        int ar[]=new int[n];
        System.out.println("Enter the elements in the array: ");
        for(int i=0;i<n;i++)
            ar[i]=sc.nextInt();
        int res=maxSubArray(ar);
        System.out.println("The majority element is Optimal: "+res);
    }
}
