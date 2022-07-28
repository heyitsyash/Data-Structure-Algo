package CodeChef;

import java.util.Scanner;

public class ChefAndCandies {
    //QUES https://www.codechef.com/JULY221C/problems/CHEFCAND

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- >0){

            int n = sc.nextInt();
            int x = sc.nextInt();

            candies(n,x);
        }
    }

    public static void candies(int n, int x){

        if(n < x){
            System.out.println(0);
            return;
        }

        int remain = n-x;

        if(remain % 4 != 0) System.out.println((remain/4) + 1);
        else System.out.println(remain / 4);
    }
}
