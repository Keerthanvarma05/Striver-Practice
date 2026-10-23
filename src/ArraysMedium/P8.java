package ArraysMedium;

import java.util.ArrayList;
import java.util.Arrays;

public class P8 {
    //Brute
    public static ArrayList leaderInArray1(int[] A) {
        int len = A.length;
        ArrayList<Integer> list = new ArrayList();
        for(int i=0;i<len;i++){
            boolean leader=true;
            for(int j=i+1;j<len;j++){
                if(A[j]>A[i]){
                    leader=false;
                    break;
                }
            }
            if(leader){
                list.add(A[i]);
            }
        }
        return list;
    }
    //Optimal
    public static ArrayList leaderInArray(int[] A) {
        int n = A.length;
        int max=Integer.MIN_VALUE;
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=n-1;i>=0;i--){
            if(A[i]>max){
                ans.add(A[i]);
            }
            max=Math.max(A[i],max);
        }
        return ans;
    }
    public static void main(String[] args){
        int arr[]={1,2,3,2};
        //Leaders in array
        ArrayList resar=leaderInArray(arr);
        System.out.println(resar);
        int arr1[]={10,22,12,3,0,6};
        //Leaders in array
        ArrayList resar1=leaderInArray(arr1);
        System.out.println(resar1);
        int arr2[]={1,5,6,2,3,4,1};
        //Leaders in array
        ArrayList resar2=leaderInArray(arr2);
        System.out.println(resar2);
    }
}