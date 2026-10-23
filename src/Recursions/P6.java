package Recursions;

import java.util.Scanner;

public class P6 {
    static void reverse(int i,int ar[],int n){
        if(i>=n/2) return;
        int temp = ar[i];
        ar[i] = ar[n-1];//n=5 but array has 0 to 4 indexes so -1
        ar[n-1] = temp;
        reverse(i+1,ar,n-1);// i+1=start,n-1=end pointers of array
        for(int j=0;j<n;j++){
            System.out.println(ar[j]);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++){
            ar[i]=input.nextInt();
        }
        reverse(0,ar,n);
    }
}
