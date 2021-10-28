package Algoriths;

import java.util.Scanner;

public class QuickSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        quickSort(arr,0, n-1);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }


    }


    //in this we divide and find the pivot(those left element are small and right element are great) and recursively call the method
    //first we check l<h(means there is at least 2 element) then we find pivot

    static void quickSort(int arr[], int l, int h){

        if(l < h){ //checking there is 2 element

            int pivot = partition(arr,l,h); // getting pivot

            quickSort(arr,l,pivot-1); // recursively calling method for divided array before pivot
            quickSort(arr,pivot+1, h); // recursively calling method for divided array after pivot
        }
    }

    //how to divide and find pivot
    //first we assume a[0] to be pivot and then initialize l and h then we'll loop until l<h(l doesn't cross h)
    //then we'll loop until a[i] < pivot and a[j] > pivot and accordingly i++ and j-- if the a[i] > pivot and a[j] < pivot then swap those 2 element
    //in case i cross the j then we break out of the outer loop then we just swap the j and lowest by this j is the index where pivot element is there and simply
    //return the j

    static int partition(int arr[], int l,int h){

        int pivot = arr[l]; //letting 0 be the pivot
        int i = l; // lowest
        int j = h;// high

        while(i<j){ // until  i doesn't cross j

            while(arr[i] <= pivot) i++; //until ith elements are smaller than pivot
            while(arr[j] > pivot) j--;//until jth elements are greater than pivot

            if(i < j){ // in case ith element is not smaller ad jth element is not greater
                swap(arr,i,j); // just swap those elements
            }
        }

        swap(arr,j,l); // in case we break out of outer loop means i crosses j then just swap j with lowest

        return j;
    }


    static void swap(int arr[], int m, int n) {
        int temp = arr[m];
        arr[m] = arr[n];
        arr[n] = temp;
    }
}
