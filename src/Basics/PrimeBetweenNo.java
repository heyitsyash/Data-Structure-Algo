package Basics;

import java.util.Scanner;

public class PrimeBetweenNo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("give n1");
        int n1 = sc.nextInt();
        System.out.println("give n2");
        int n2 = sc.nextInt();

        for (int no = n1; no <= n2; no++) {
            int count = 0;
            for (int j = 1; j <= no; j++) {
                if (no % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println( no + " IS PRIME");
            } else {
                System.out.println(no + " IS NON PRIME");
            }

        }

    }
}
