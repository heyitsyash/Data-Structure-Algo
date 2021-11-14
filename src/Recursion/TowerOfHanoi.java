package Recursion;

import java.util.Scanner;
//QUES https://www.geeksforgeeks.org/java-program-for-tower-of-hanoi/
public class TowerOfHanoi {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("input no of disks");
        int n = sc.nextInt();


        movingDisks(3, "src", "help", "dest");

    }

    //moving disks from sr to dest by follow rules
    public static void movingDisks(int n, String src, String helper, String dest) {

        if (n == 1) { //base case -> if only 1 disk is there
            System.out.println("transfer disk " + n + " from " + src + " to " + dest);
            return;
        }
        movingDisks(n - 1, src, dest, helper); //using help disk to move the n-1 disk to help
        System.out.println("transfer disk " + n + " from " + src + " to " + dest); // the moving the nth disk to dest
        movingDisks(n - 1, helper, src, dest);//then again moving disk from help to dest using src as a helper

        //and recursively calling themselves
    }

}
