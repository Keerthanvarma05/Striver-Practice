package ArraysEasy;

import java.util.Scanner;

public class P12 {
    //Brute
    static int longestSubArrayPos1(int[] arr, int k) {
        int n = arr.length;
        int maxlen = 0;
        for (int startindex = 0; startindex < n; startindex++) {
            for (int endindex = startindex; endindex < n; endindex++) {
                int currentsum = 0;
                for (int i = startindex; i <= endindex; i++) {
                    currentsum += arr[i];
                }
                if (currentsum == k) {
                    maxlen = Math.max(maxlen, endindex - startindex + 1);
                }
            }
        }
        return maxlen;
    }

    //Optimal(Sliding Window)
    static int longestSubArrayPos2(int[] arr, int k) {
        int n = arr.length;
        int left = 0;
        int right = 0;
        int maxlen = 0;
        int cursum = arr[0];
        while (right < n) {
            while (left <= right && cursum > k) {
                cursum -= arr[left];
                left++;
            }
            if (cursum == k) {
                maxlen = Math.max(maxlen, right - left + 1);
            }
            right++;
            if (right < n) {
                cursum += arr[right];
            }
        } return maxlen;
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++){
            ar[i]=sc.nextInt();
        }
        System.out.println("Enter k: ");
        int k=sc.nextInt();
        int result=longestSubArrayPos2(ar,k);
        System.out.println("Longest length of positive sub Array: "+result);
    }
}
