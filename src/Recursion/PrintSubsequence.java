package Recursion;

import java.util.ArrayList;
import java.util.List;

public class PrintSubsequence {

    public static void main(String[] args) {

        int sum =2;
        int s =0;
        int arr[] = {1,2,1};
        List<Integer> list = new ArrayList<>();
        //subsequence(0,list,arr.length,arr);
        subsequenceWithSumK(0,list, arr.length,arr,sum,s);
    }

    private static void subsequence(int ind, List<Integer> list,int n,int arr[]) {

        if(ind == n){
            System.out.println(list);
            return;
        }

        //here we are taking the element
        list.add(arr[ind]);
        //then moving forward with that element
        subsequence(ind+1,list,n,arr);
        //now making subsequence by removing that element
        list.remove(list.get(list.size()-1));
        //then moving forward by not taking that element
        subsequence(ind+1,list,n,arr);
    }

    static void subsequenceWithSumK(int ind,List<Integer> list,int n, int arr[], int sum,int s){


        if(ind == n){
            if(s == sum) System.out.println(list);
            return;
        }

        list.add(arr[ind]);
        s+=arr[ind];
        subsequenceWithSumK(ind+1,list,n,arr,sum,s);

        list.remove(list.get(list.size()-1));
        s-=arr[ind];
        subsequenceWithSumK(ind+1,list,n,arr,sum,s);
    }
}
