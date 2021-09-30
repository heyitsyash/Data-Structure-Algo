package Array;

import java.util.Arrays;
import java.util.Scanner;

//QUESTION
// https://practice.geeksforgeeks.org/problems/kth-smallest-element5635/1#

public class KthSmallestElement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("give kth no");
        int k = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(smallestElement(arr, k));
    }

    public static int smallestElement(int arr[], int k) {
        Arrays.sort(arr);
        return arr[k - 1];
    }
}
