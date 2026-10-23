package ArraysEasy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class P5 {
    static void reverse(int[] arr,int start,int end) {
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    static void rotateOne(int[] arr) {
        int temp=arr[0];
        int k=arr.length;
        for(int i=1;i<k;i++){
            arr[i-1]=arr[i];
        }
        arr[k-1]=temp;
    }
    //Brute Force
    static void rotateKtimes1(int[] arr,int k) {
        ArrayList<Integer> list=new ArrayList<>();
        int n=arr.length;
        k = k % n;
        /* Store first k elements
        int[] temp = Arrays.copyOfRange(arr, 0, k);*/
        for(int i=0;i<k;i++){
            list.add(arr[i]);
        }
        for(int j=k;j<n;j++){
            arr[j-k]=arr[j];
        }
        for(int i=0;i< list.size();i++){
            arr[n-k+i]=list.get(i);
        }

    }
    static void rotateKtimes2(int[] arr,int k,String direction) {
        int n=arr.length;
        k = k % n;
        if(direction.equalsIgnoreCase("Left")){
            reverse(arr,0,k-1);
            reverse(arr,k,n-1);
            reverse(arr,0,n-1);
        }
        else if(direction.equalsIgnoreCase("Right")){
            reverse(arr,0,n-1);
            reverse(arr,0,k-1);
            reverse(arr,k,n-1);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println("Enter no.of postions to rotate: ");
        int k = input.nextInt();
        System.out.println("Enter rotate direction: ");
        String direction = input.next();
        rotateKtimes2(arr,k,direction);
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
