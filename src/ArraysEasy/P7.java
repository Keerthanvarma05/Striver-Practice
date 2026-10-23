package ArraysEasy;

import java.util.Scanner;

public class P7 {
    static int linearSearch(int[] arr,int key){
        int index=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                index=i;
                break;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        System.out.println("Enter Key: ");
        int key=in.nextInt();
        System.out.println("Position of key in array: "+linearSearch(arr,key));
    }
}
