package Array;

import java.util.Scanner;

//Ques https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
public class StockBuySell1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] =  new int[n];

        for (int  i=0; i<n;i ++){
            arr[i] = sc.nextInt();
        }

        System.out.println(maxProfit(arr,n));
    }

    //our approach is to find the minn value(buy) before the current index(sell) and then find the profit
    // (sell - buy) and then see the max profit between earlier and current and return max profit
    //time Complexity O(n) space O(1)
    static int maxProfit(int arr[], int n){

        int max_profit = 0;
        int minSoFar = arr[0];

        for (int i=0; i<n; i++){
            minSoFar = Math.min(minSoFar,arr[i]);
            int profit = arr[i] - minSoFar;
            max_profit = Math.max(max_profit,profit);
        }

        return max_profit;
    }
}
