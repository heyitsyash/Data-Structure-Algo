package Array;

import java.util.Scanner;
//QUES https://practice.geeksforgeeks.org/problems/kadanes-algorithm-1587115620/1

public class KadanesAlgo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        //System.out.println(largestSum(arr,n));
        System.out.println(kadensLargestSum(arr,n));
    }

    //Broot Force ALgo
    static int largestSum(int arr[], int n){
        int maxSum = -1000000000;
        for (int i=0; i<n; i++){      //traversing through the loop and checking every possible sub arrays
            int sum =0;
            for (int j =i; j<n ;j++){ // checking test cases for index j
                sum += arr[j];         //adding the sum
                if(sum > maxSum){      //if max than store and then again check again for another index and making sum =0
                    maxSum = sum;
                }
            }
        }
        return maxSum;

    }

    //Kadane's Algo
    static int kadensLargestSum(int arr[], int n){
        int cuurSum =0;
        int maxxSum =0;

        for (int i=0; i<n ;i++){  //traversing through loop in linear fashion
            cuurSum+= arr[i]; // adding elements from starting index

            if (cuurSum > maxxSum){
                maxxSum = cuurSum; //if max then store
            }

            if (cuurSum < 0){ // if then sum of the elements become < 0(means negative no comes in between arr) then again sum = 0
                cuurSum =0;  //and re calculating curr sum from next index
            }
        }

        return maxxSum;
    }
}
