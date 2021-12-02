package Algoriths;

import java.util.Scanner;

public class InsertionSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        insertionSort(arr, n);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    //letting i=0 the sorted array and starting from i=1 ... n the unsorted array then moving from i-1... 0 and
    // checking if the element is >=0 && it is also greater the temp then right shift the element and  j--
    //if the inner loop breaks than put the value of temp in j+1

    static void insertionSort(int arr[], int n) {

        for (int i = 1; i < n; i++) { //unsorted array
            int temp = arr[i]; //storing the value so it is not lost

            int j = i - 1;   // initializing j

            while (j >= 0 && arr[j] > temp) { //checking condition
                arr[j + 1] = arr[j]; //right shifting the element
                j--;
            }
            arr[j + 1] = temp; //after breaking inner loop

        }
    }
}
