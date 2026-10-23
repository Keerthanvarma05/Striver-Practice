package ArraysEasy;

import java.util.Arrays;
import java.util.Scanner;

public class P9 {
    //Better
    static int findMissing1(int[] arr){
        int n=arr.length+1;
        int hash[]=new int[n+2]; //
        for(int i=0;i< n-1;i++){
            hash[arr[i]]++;
        }
        for(int i=1;i< hash.length;i++){
            if(hash[i]==0){
                return i;
            }
        }
        return -1;
    }
    //Optimal
    static int findMissing2(int[] arr){
        int n=arr.length+1;
        int sum=(n*(n+1))/2; //5*6/2=30/2=15
        int arsum=0;
        for(int i=0;i<arr.length;i++){
            arsum+=arr[i];
        }
        return sum-arsum;
    }
    //Brute
    static int findMissing3(int[] arr) {
        int n = arr.length + 1;
        // Iterate from 1 to n and check
        // if the current number is present
        for (int i = 1; i <= n; i++) {
            boolean found = false;
            for (int j = 0; j < n - 1; j++) {
                if (arr[j] == i) {
                    found = true;
                    break;
                }
            }
            // If the current number is not present
            if (!found)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++){
            ar[i]=sc.nextInt();
        }
        Arrays.sort(ar);
        int res=findMissing2(ar);
        System.out.println("Missing: "+res);
    }
}
