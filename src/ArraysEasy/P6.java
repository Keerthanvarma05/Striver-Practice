package ArraysEasy;
import java.util.Scanner;

public class P6 {
    //Brute Force
    static int[] moveZeroToEnd1(int[] arr){
        int temp[]=new int[arr.length];
        int index=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                temp[index]=arr[i];
                index++;
            }
        }
        for(int j=0;j< arr.length;j++){
            arr[j]=temp[j];
        }
        return arr;
    }
    //Optimal
    static void moveZeroToEnd2(int[] arr){
        int j=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                j=i; //finds first zero index and assigns to j
                break;
            }
        }
        int i=0;
        if(j==-1) return;
        for(i=j+i;i<arr.length;i++){ //placed next to the 1st zero index
            if(arr[i]!=0){
                int temp=arr[i]; //if its non zero swaps elements of indexes j,i
                arr[i]=arr[j]; //else just passes to next index in array (i++)
                arr[j]=temp;
            }
        }
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int arr[]=new int[n];
        for(int i = 0; i <n; i++){
            arr[i]=in.nextInt();
        }
        moveZeroToEnd2(arr);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
