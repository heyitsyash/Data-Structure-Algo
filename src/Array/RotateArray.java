package Array;

import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        rotateArray(arr, n);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }


    static void rotateArray(int arr[], int n) {

        int hold = arr[n-1]; //keeping last element

        //starting from second last index shifting second last element to last index
        for(int i = (n-2) ; i>=0; i--){
            arr[i+1] = arr[i];
        }
        //at last putting last element to first index
        arr[0] = hold;

    }
}
