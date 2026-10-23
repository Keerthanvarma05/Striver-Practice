package ArraysEasy;

import java.util.Scanner;

public class P11 {
    //Brute Force
    static int getSingleElement1(int arr[]){
        for(int i=0;i<=arr.length-1;i++){
            int count=0;
            int num=arr[i];
            for(int j=0;j<arr.length;j++){
                if(arr[j]==num){
                    count++;
                }
            }
            if(count==1) return num;
        }
        return -1;
    }
    // Function to find the single element using a hash array(Better)
    static int getSingleElement2(int[] arr) {
        int n = arr.length;
        // Step 1: Find maximum element
        int maxi = arr[0];
        for (int i = 0; i < n; i++) {
            maxi = Math.max(maxi, arr[i]);
        }
        // Step 2: Create frequency array of size maxi+1
        int[] hash = new int[maxi + 1];
        // Step 3: Count frequencies
        for (int i = 0; i < n; i++) {
            hash[arr[i]]++;
        }
        // Step 4: Find element with frequency = 1
        for (int i = 0; i < n; i++) {
            if (hash[arr[i]] == 1)
                return arr[i];
        }
        return -1; // fallback
    }
    //Optimal uses XOR
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++){
            ar[i]=sc.nextInt();
        }
        int res=getSingleElement2(ar);
        System.out.println("Element that appears only once in arr: "+res);
    }
}
