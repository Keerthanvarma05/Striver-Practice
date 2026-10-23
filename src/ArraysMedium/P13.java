package ArraysMedium;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class P13 {
    //count subarray sums k
    //Better Approach
    public static int countNoOfSubarray(int ar[],int k){
        int n = ar.length;
        int count = 0;
        for(int i=0;i<n;i++){
            int sum = 0;
            for(int j=i;j<n;j++){
                sum+=ar[j];
                if(sum==k){
                    count++;
                }
            }
        }
        return count;
    }
    //Optimal Approach
    public static int countNoOfSubarray1(int ar[],int k){
        Map<Integer,Integer> map = new HashMap<>();
        // Prefix sum 0 occurs once initially
        map.put(0, 1);
        int prefixSum = 0;
        int count = 0;
        for (int i = 0; i < ar.length; i++) {
            // Calculate prefix sum
            prefixSum += ar[i];
            // Find the required prefix sum
            int remove = prefixSum - k;
            // Add number of times required prefix sum occurred
            count += map.getOrDefault(remove, 0);
            // Store/update current prefix sum
            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
        }
        return count;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int []ar={1,2,3,-3,1,1,1,4,2,-3};
        int k=3;
        int ans=countNoOfSubarray(ar,k);
        System.out.println(ans);
        int ans1=countNoOfSubarray1(ar,k);
        System.out.println(ans1);
    }
}
