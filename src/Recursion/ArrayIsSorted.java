package Recursion;

public class ArrayIsSorted {

    public static void main(String[] args) {

        int arr[] = {2,5,6,7,7};

        boolean ans = isSorted(arr,arr.length);

        System.out.println(ans);
    }

    public static boolean isSorted(int arr[], int n){

        if(n==1 || n== 0) return true;

        if(arr[n-1] < arr[n-2])return false;

        return isSorted(arr,n-1);
    }
}
