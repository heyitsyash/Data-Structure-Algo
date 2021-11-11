package Recursion;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a =0, b =1;

        int n = sc.nextInt(); // N Fibonacci Nos

        System.out.println(a);
        System.out.println(b);

        printFib(0,1,n-2); // n-2 because we have already printed a & b
    }

    public static void printFib(int a , int b, int n){

        if (n == 0) {
            return;
        }

        int c = a+b;
        System.out.println(c);
        printFib(b,c,n-1); //at each iteration we are decreasing n so that we can hit the base case
    }
}
