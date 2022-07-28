package CodeChef;

import java.util.Scanner;

public class PassTheExam {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- >0){

            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();


            passOrFail(a,b,c);
        }
    }

    public static void passOrFail(int a, int b, int c){

        if(a+b+c >= 100 && a>=10 && b>=10 && c>=10)
            System.out.println("PASS");

        else System.out.println("FAIL");
        System.out.println(6/4);
        System.out.println(6%4);
        System.out.println(1%4);

    }
}
