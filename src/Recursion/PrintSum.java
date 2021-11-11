package Recursion;

import java.util.Scanner;

public class PrintSum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        printSum(1,n,0);
    }
    public static void printSum(int i, int n, int sum){

        if(i==n){
            sum+=i;
            System.out.println(sum);
            return;
        }

        sum+=i;
        printSum(i+1,n,sum);
        System.out.println(i);
    }
}
