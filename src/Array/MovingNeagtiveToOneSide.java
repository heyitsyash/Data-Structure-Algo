package Array;

import java.util.Arrays;
import java.util.Scanner;
//QUES
//https://www.geeksforgeeks.org/move-negative-numbers-beginning-positive-end-constant-extra-space/

public class MovingNeagtiveToOneSide {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("input the length");
        int n = sc.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // rearrange(arr, n);
        twoPointerWay(arr, 0, n - 1);
        printArray(arr, n);
    }

    static void twoPointerWay(int arr[], int left, int right) {

        while (left <= right) {

            //Check If the left and right pointer elements are negative then simply increment the left pointer.
            if (arr[left] < 0 && arr[right] < 0) {
                left++;
            }
            //Otherwise, if the left element is positive and the right element is negative then simply swap the elements
            else if (arr[left] > 0 && arr[right] < 0) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
            //Else if the left element is positive and the right element is also positive then simply decrement the right pointer
            else if (arr[left] > 0 && arr[right] > 0) {
                right--;
            }
            //else left is negative and right is positive
            else {
                left++;
                right--;
            }
        }
    }

    static void rearrange(int arr[], int n) {
        // -1, 2, -3, 4, 5, 6, -7, 8, 9
        int j = 0, temp;
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                if (i != j) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
        }
    }

    static void printArray(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
