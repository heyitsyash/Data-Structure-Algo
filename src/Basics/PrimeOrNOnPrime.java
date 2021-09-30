package Basics;

import java.util.Scanner;

public class PrimeOrNOnPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {

            int n = sc.nextInt();
            int count = 0;
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    count++;
                }
            }

            if (count == 2) {
                System.out.println("PRIME");
            } else {
                System.out.println("NON PRIME");
            }
        }
    }
}


