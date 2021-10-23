package Algoriths;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        sortAnArray(arr, n);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // ANOTHER METHOD
    static void sortArray(int arr[], int n) {
        for (int i = n - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }

    }

    static void sortAnArray(int arr[], int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }

    }

    static void swap(int arr[], int m, int n) {
        //  int temp = 0;
        int temp = arr[m];
        arr[m] = arr[n];
        arr[n] = temp;
    }
}
