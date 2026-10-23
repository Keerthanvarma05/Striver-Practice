package ArraysMedium;

import java.util.Scanner;

public class P2 {
    //Brute for sort 0s1s2s will be merge or quick sort
    //Better manually enter the elements
    public static void sort0s1s2s1(int[] arr) {
        int n = arr.length;
        int count0=0,count1=0,count2=0;
        for (int i = 0; i < n; i++) {
            if (arr[i]==0) count0++;
            else if(arr[i]==1) count1++;
            else count2++;
        }
        for (int i = 0; i < count0; i++) { arr[i]=0; }
        for (int i = count0; i < count0+count1; i++) { arr[i]=1; }
        for (int i = count0+count1; i < count0+count1+count2; i++) { arr[i]=2; }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    //Optimal will be using Dutch National Flag Algorithm
    public static void sort0s1s2s2(int[] arr) {
        int n = arr.length;
        int low=0;
        int mid=0;
        int high=n-1;
        while (mid<=high){
            if(arr[mid]==0){
                int temp=arr[low];
                arr[low]=arr[mid];
                arr[mid]=temp;
                low++;
                mid++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else if(arr[mid]==2){
                int temp=arr[high];
                arr[high]=arr[mid];
                arr[mid]=temp;
                high--;
            }
        }
        for(int j=0;j<n;j++){
            System.out.print(arr[j]+" ");
        }
        System.out.println();
    }
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements of array: ");
        int ar[]=new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }
        System.out.println("Better Solution: ");
        sort0s1s2s1(ar);
        System.out.println("Optimal Solution: ");
        sort0s1s2s2(ar);
    }
}
