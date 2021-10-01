package Array;

import java.util.Scanner;

//QUES https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
public class StockBuySell2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] =  new int[n];

        for (int  i=0; i<n;i ++){
            arr[i] = sc.nextInt();
        }

        System.out.println(maxProfit(arr,n));
    }

    static int maxProfit(int arr[], int n){

        int max_profit = 0;

        for(int i=1; i<n; i++){
            if (arr[i] > arr[i-1]){
                max_profit += arr[i] - arr[i-1];
            }
        }

        return max_profit;
    }
}


