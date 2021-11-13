package Recursion;


import java.util.Scanner;

//QUES Print x^n (with stack height = logn)
public class CalculatePowerLogn {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = sc.nextInt();

        int ans = calcPower(n, x);
        System.out.println(ans);
    }

    public static int calcPower(int n, int x) {

        if (n == 0) {
            return 0;
        }

        if (x == 0) {
            return 1;
        }

        //if the power is even
        if (x % 2 == 0) {  // n^x can be written as n^x/2 * n^x/2 if the n is odd
            return calcPower(n, x / 2) * calcPower(n, x / 2);
        }
        //if the power is odd
        else {
            return calcPower(n, x / 2) * calcPower(n, x / 2) * n;  // n^x can be written as n^x/2 * n^x/2 * n if the n is odd
        }

    }
}
