package CodeChef;

import java.util.Arrays;
import java.util.Scanner;

public class GameOfPiles {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-->0){

            int n = sc.nextInt();
            int[] arr = new int[n];

            for(int i =0; i<n; i++){
                arr[i] = sc.nextInt();
            }

            winner(arr,n);
        }
    }

    public static void winner(int[] arr, int n){

        for(int num : arr){
            if (num == 1){
                System.out.println("CHEF");
                return;
            }
        }



        int sum =0;
        for(int num : arr){
            sum += num;
        }

       // System.out.println(sum);

        if(sum % 2 == 0) System.out.println("CHEFINA");

        else System.out.println("CHEF");
    }
}
