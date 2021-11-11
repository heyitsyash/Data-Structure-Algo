package Recursion;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int factorial = calcFactorial(n);

        System.out.println(factorial);
    }

    public static int calcFactorial(int n){

        if(n==1 || n==0){
            return 1;
        }

        return n * calcFactorial(n-1);
    }
}
