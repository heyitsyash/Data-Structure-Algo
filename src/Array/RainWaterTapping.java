package Array;

import java.util.Scanner;
//QUES https://www.techiedelight.com/trapping-rain-water-within-given-set-bars

//Trapping rainwater problem: Find the maximum amount of water that can be trapped within a given
     //   set of building where each building's width is 1 unit.

public class RainWaterTapping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n];

        //Input: An array containing height of buildings {7, 0, 4, 2, 5, 0, 6, 4, 0, 5}
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(waterCollected(arr,n));

    }

 /*   The idea is to calculate the maximum height bar on the left and right of every bar. The amount of water stored on
    top of each bar is equal to the minimum among the leading' bar to the left and right minus the current bar's height.
   */
 static int waterCollected(int arr[], int n){

        int left[] = new int[n]; //left arr which will store max height building in left
        int right[] = new int[n];//right arr which will store max height building in right


        left[0] = arr[0]; //leftest max building starting point
        for (int i=1; i<n; i++){ //storing the max height building btw current building and earlier max
            left[i] = Math.max(arr[i],left[i-1]);
        }


        right[n-1] = arr[n-1];//rightest max building starting point
        for (int i = n-2; i>=0; i--){ //storing the max height building btw current building and earlier max
            right[i] = Math.max(arr[i],right[i+1]);
        }

        int ans =0;
        for (int i=0; i<n; i++){ //amount of water stored on the building will be
            ans += (Math.min(left[i],right[i])) - arr[i];  //min btw left's max and rights' max - the current building height
        }

        return ans;
    }
}
