package Recursion;

import java.util.Scanner;

public class ReverseStringRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        revString(str, str.length() - 1);

    }

    static void revString(String str, int index) {

        if (index == 0) {
            System.out.print(str.charAt(index));
            return;
        }

        //printing the last index and then recur calling function for index-1
        System.out.print(str.charAt(index) + " ");
        revString(str, index - 1);
    }
}
