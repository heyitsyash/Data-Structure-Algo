package Recursion;

import java.util.Scanner;

public class PrintBackTracking {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        int n = sc.nextInt();

        print(n,n);
    }

    static void print(int i ,int n){

        if(i < 1) return;

        print(--i,n);
        System.out.println(i);
    }
}
