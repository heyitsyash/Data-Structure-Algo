package CodeChef;

import java.util.Scanner;

public class BinaryArray {
    public static void main(String[] args) {

        // your code goes here
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- >0){

            int n = sc.nextInt();
            int arr[] = new int[n];

            for(int i =0; i<n;i++){
                arr[i] = sc.nextInt();
            }

            int result = findSubArray(arr,arr.length);

            System.out.println(result);
        }
    }

    public static int findSubArray(int arr[],int n){

        int sum =0;
        // Pick starting point
        for (int i=0; i <n; i++)
        {
            // Pick ending point
            for (int j=i; j<n; j++)
            {
                // Print subarray between current starting
                // and ending points
                int result = 1 ;
                for (int k=i; k<=j; k++){
                    result *= arr[k];
                }
                sum += result;
            }
        }

        return sum;
    }
}

