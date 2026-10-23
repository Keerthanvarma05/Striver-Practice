package ArraysMedium;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class P3 {
    //Brute
    public static int majorityElement(int[] nums) {
        // Size of the given array
        int n = nums.length;
        // Iterate through each element of the array
        for (int i = 0; i < n; i++) {
            // Counter to count occurrences of nums[i]
            int cnt = 0;
            // Count the frequency of nums[i] in the array
            for (int j = 0; j < n; j++) {
                if (nums[j] == nums[i]) {
                    cnt++;
                }
            }
            // Check if frequency of nums[i] is greater than n/2
            if (cnt > (n / 2)) {
                // Return the majority element
                return nums[i];
            }
        }
        // Return -1 if no majority element is found
        return -1;
    }
    //Better
    public static int majoritynby2(int[] arr){
        int n=arr.length;
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int count;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > n / 2) {
                return entry.getKey();
            }
        }
        return -1;
    }
    //Optimal Approach uses Moore's Voting algorithm
    public static int majoritynby21(int[] arr){
        int n=arr.length;
        int count=0,ele=0;
        for(int i=0;i<n;i++){
            if(count==0){
                count=1;
                ele=arr[i];
            }
            else if(ele==arr[i]) count++;
            else count--;
        }
        int count1=0;
        for(int j=0;j<n;j++){
            if(ele==arr[j]) count1++;
        }
        if(count1>n/2) return ele;
        else return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n=sc.nextInt();
        int ar[]=new int[n];
        System.out.println("Enter the elements in the array: ");
        for(int i=0;i<n;i++){
            ar[i]=sc.nextInt();
        }
        int res=majorityElement(ar);
        System.out.println("The majority element is Brute Force: ");
        System.out.println(res);
        int res1=majoritynby2(ar);
        System.out.println("The majority number is Better Approach: ");
        System.out.println(res1);
        int res2=majoritynby21(ar);
        System.out.println("The majority number is Optimal Approach: ");
        System.out.println(res2);

    }
}
