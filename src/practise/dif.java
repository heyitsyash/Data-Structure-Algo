package practise;

import java.util.Scanner;

public class dif {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n= sc.nextInt();

        System.out.println(dif(m,n));
    }

    public static int dif(int m,int n){

        int count =0, count2 =0;
     for(int i =1; i<= n ; i++){
         if(i % m == 0) count+= i;
         else count2 += i;
     }

        return Math.abs(count - count2);
    }
}
