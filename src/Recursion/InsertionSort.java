package Recursion;

public class InsertionSort {


    public static void main(String[] args) {
        int arr[] = {2,5,1,6,9,81};

        sort(arr, arr.length,0);

        for(int i : arr){
            System.out.println(i);
        }
    }



    public static void sort(int arr[], int n,int i){


        if(i == n-1)return;

        for (int j =i+1;j<n;j++){
            if(arr[j] < arr[i]){
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        sort(arr,n,i+1);
    }
}
