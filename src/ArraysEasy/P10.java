package ArraysEasy;

import java.util.Scanner;

public class P10 {
    static int findMaxConsecutive(int[] arr){
        int maxcount =0;
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                count++;
            }
            else{
                count=0;
            }
            maxcount =Math.max(maxcount,count);
        }
        return maxcount;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++){
            ar[i]=sc.nextInt();
        }
        int res=findMaxConsecutive(ar);
        System.out.println(res);
    }
}
