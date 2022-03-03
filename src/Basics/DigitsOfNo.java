package Basics;

import java.util.ArrayList;
import java.util.Scanner;

public class DigitsOfNo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int result = n;
        int count = 0;

        ArrayList arr = new ArrayList();

        while (result > 0) {
            count = result % 10; //this returns the last no
            result = result / 10; //this returns the no rather than the last no
            arr.add(count);

        }
        for (int i = arr.size() - 1; i >= 0; i--) {
            System.out.println(arr.get(i));
        }

    }
}
