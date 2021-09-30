package Array;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSumSubArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(sumSubArray(arr,n));

    }

    static int sumSubArray(int arr[], int n) {

        Arrays.sort(arr);

        int sum = arr[arr.length - 1];

        for (int i = arr.length - 2; i >= 0; i--) {
            if (sum + arr[i] > sum) {
                sum += arr[i];
            } else {
                continue;
            }
        }
        return sum;
    }
}
