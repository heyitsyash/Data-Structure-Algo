package Algoriths;

import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        selectionSort(arr, n);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    //we find the min element in unsorted arr and put it in sorted array
    //here we assume the i=o...n the unsorted array and let the i position to be min then
    // in inner loop we find the min element which starts from i+1 and then check whether
    //the element to be swap is not same if it's not then put it in sorted array
    static void selectionSort(int arr[] , int n){

        for(int i=0; i<n-1; i++){ //looping through unsorted array

            int min = i; //assuming the min index
            for(int j =i+1; j<n; j++){
                if(arr[j] < arr[min]){
                    min = j; //finding the min
                }
            }
            if(min != i){ //checking whether it is not the same element
                swap(arr,min,i); // if it's not then swap
            }
        }
    }

    static void swap(int arr[], int m, int n) {
        int temp = arr[m];
        arr[m] = arr[n];
        arr[n] = temp;
    }
}
