package ArraysMedium;

import java.util.Arrays;

public class P9 {
    //Longest Successive/consecutive sequence
    public static boolean linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return true;
            }
        }
        return false;
    }
    //Brute Force
    public static int longestConsecutiveseq1(int[] arr,int n) {
        int longest = 1;
        for(int i=0;i<n;i++){
            n=arr[i];
            int cnt=1;
            while(linearSearch(arr,n+1)==true){
                n=n+1;
                cnt=cnt+1;
            }
            longest=Math.max(longest,cnt);
        }
        return longest;
    }
    //Better Approach
    public static int longestConsecutiveseq2(int[] arr,int n) {
        if(n==0) return 0;
        Arrays.sort(arr);
        int longest = 1;
        int lastsmallest = Integer.MIN_VALUE;
        int cnt=0;
        for(int i=0;i<n;i++){
            if(arr[i]-1==lastsmallest){
                cnt+=1;
                lastsmallest=arr[i];
            } else if(lastsmallest!=arr[i]){
                cnt=1;
                lastsmallest=arr[i];
            }
            longest=Math.max(longest,cnt);
        }
        return longest;
    }
    public static void main(String[] args) {
        int[] arr1 = {102,1,104,3,103,101,2,4,5};
        int n1 = arr1.length;
        int res1=longestConsecutiveseq1(arr1,n1);
        System.out.println(res1);
        int[] arr2 = {101,101,101,1,1,4,4,4,3,3,5,5,102,1,2,2,103,103};
        int n2 = arr2.length;
        int res2=longestConsecutiveseq2(arr2,n2);
        System.out.println(res2);
    }
}
