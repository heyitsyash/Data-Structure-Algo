package Recursion;

import java.util.Scanner;

public class PrintN {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        print(1,n);
    }

    static void print(int i, int n){

        if(i > n) return;

        System.out.println(i);
        print(++i,n);
    }
}
