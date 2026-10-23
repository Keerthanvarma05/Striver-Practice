package ArraysMedium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class P1 {
    //Brute Force
    static int[] twosum(int[] arr,int k) {
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==k){
                    int[] temp=new int[2];
                    temp[0]=i;
                    temp[1]=j;
                    Arrays.sort(temp);
                    return temp;
                }
            }
        }
        return new int[]{-1,-1};
    }
    //Optimal YES or NO version
    static boolean twoSum1(int arr[], int target) {
        int n = arr.length;
        int left = 0;
        int right = n - 1;
        while (left < right) {
            int sum=arr[left]+arr[right];
            if (sum==target) return true;
            if(sum<target) left++;
            if(sum>target) right--;
        }
        return false;
    }
    //Optimal for returning indexes
    public static int[] twoSum2(int arr[],int target) {
        int n = arr.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int rem=target-arr[i];
            if (map.containsKey(rem)) {
                return new int[] {map.get(rem),i};
            }
            map.put(arr[i],i);
        }
        return new int[] {-1,-1};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Target: ");
        int k=sc.nextInt();
        boolean result = twoSum1(a, k);
        System.out.println("Version 1 with yes or no: "+result);
        int [] res =twoSum2( a , k );
        System.out.println("Version 2 with indexes: ");
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]+" ");
        }
    }
}
