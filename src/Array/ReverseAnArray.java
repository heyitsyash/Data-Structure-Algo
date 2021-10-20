package Array;

import java.sql.SQLOutput;
import java.util.Scanner;

//QUESTION
// https://www.geeksforgeeks.org/write-a-program-to-reverse-an-array-or-string/

public class ReverseAnArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("input an array or string");

        //For Array
        int input = sc.nextInt();

        // String str = sc.nextLine();

        int[] array = new int[input];

        for (int i = 0; i < input; i++) {
            array[i] = sc.nextInt();
        }

        //  reverseString(str);
        reverseArray(array, 0, input - 1);
        recursive(array, 0, input - 1);
        printArray(array, input);

    }


    //ITERATIVE FUNCTION
    //we move from left index and right index and swap them
    private static void reverseArray(int[] arr, int start, int end) {
        int temp = 0;
        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;

        }
    }

    //PRINT FUNCTION
    static void printArray(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    //RECURSIVE METHOD
    //we move from left index and right index and swap them and them recursively call the function
    private static void recursive(int arr[], int start, int end) {

        if (start >= end) {
            return;
        }
        int temp;
        temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        recursive(arr, ++start, --end);
    }
}
