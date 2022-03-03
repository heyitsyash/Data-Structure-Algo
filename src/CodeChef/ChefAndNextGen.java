package CodeChef;

import java.util.Scanner;

//QUES https://www.codechef.com/FEB222C/problems/HELIUM3
public class ChefAndNextGen {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t= sc.nextInt();

        while (t-->0){

            int a = sc.nextInt();
            int b = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();

            long gov = a*b;
            long nextGen = x*y;

            if(nextGen >= gov){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
    }
}
