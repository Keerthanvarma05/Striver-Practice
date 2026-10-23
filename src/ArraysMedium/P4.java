package ArraysMedium;

import java.util.Scanner;

public class P4 {
    //Brute Force
    public static int maxSubArraySum(int[] arr) {
        int n=arr.length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    sum+=arr[k];
                }
                max=Math.max(sum,max);
            }
        }
        return max;
    }
    //Better
    public static int maxSubArraySum1(int[] arr) {
        int n=arr.length,max=Integer.MIN_VALUE;
        for(int i = 0; i <n; i++){
            int sum=0;
            for(int j = i+1; j < n; j++){
                sum+=arr[j];
                max=Math.max(sum,max);
            }
        }
        return max;
    }
    //Optimal Approach uses Kadane's Algorithm
    public static int maxSubArraySum2(int[] arr) {
        int n=arr.length;
        int max=0,sum=0;
        for(int i = 0; i<n; i++){
            sum+=arr[i];
            if(sum>max){
                max=sum;
            }
            if(sum<0){
                sum=0;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n=sc.nextInt();
        System.out.println("Enter the elements in the array: ");
        int ar[]=new int[n];
        for(int i=0;i<n;i++){
            ar[i]=sc.nextInt();
        }
        int res=maxSubArraySum(ar);
        System.out.println("The max subarray sum is Brute Force: ");
        System.out.println(res);
        int res1=maxSubArraySum1(ar);
        System.out.println("The majority element is Better: ");
        System.out.println(res1);
        int res2=maxSubArraySum2(ar);
        System.out.println("The majority element is Optimal: ");
        System.out.println(res2);
    }
}
