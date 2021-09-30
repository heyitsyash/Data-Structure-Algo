package Basics;

import java.util.ArrayList;
import java.util.Scanner;

public class ReverseNo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int result = n;
        int count = 0;


        while (result > 0) {
            count = result % 10;
            result = result / 10;
            System.out.println(count);
        }
    }
}
