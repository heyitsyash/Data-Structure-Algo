package Recursion;

import java.util.Scanner;

public class CalculatePower {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = sc.nextInt();

        int ans = calPower(n,x);
        System.out.println(ans);
    }

    public static int calPower(int n , int x){

        if(n ==0){
            return 0;
        }

        if(x == 0){
            return 1;
        }

        return n * calPower(n, x-1);
    }
}
