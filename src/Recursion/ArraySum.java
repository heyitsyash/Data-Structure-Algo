package Recursion;

import problems.Solution;

public class ArraySum {

    public static void main(String[] args) {

        int arr[] = {2,2};

        int i =0,sum = 0;

        System.out.println(ArraySum(arr,arr.length,i,sum));
    }

    public static int ArraySum(int arr[],int n,int i,int sum){

        if(n == 1)return arr[0];
        if(i == n) return sum;

        sum += arr[i];

       return ArraySum(arr, arr.length, ++i,sum);
    }
}
