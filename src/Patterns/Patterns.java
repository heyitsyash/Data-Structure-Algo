package Patterns;

import java.util.Scanner;

public class Patterns {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        int n = sc.nextInt(); //n is equals to rows outer loop
//        int m = sc.nextInt(); // m is equals to column inner loop

        //for rectangle
//        for(int i =1 ; i<=n; i++){
//            for (int j =1; j<=m;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        // for hollow rectangle
//        for(int i=1; i<=n;i++){
//
//            for(int j=1; j<=m;j++){
//                if(i==1 || j==1 || i==n || j==m){
//                    System.out.print("*");
//                }else {
//                    System.out.print(" ");
//                }
//            }
//
//            System.out.println();
//        }

//        //Half pyramid
//        int n = sc.nextInt();
//
//        for (int i = 1; i <= n; i++) {
//
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        //Inverse Pyramid
//        int n = sc.nextInt();
//
//        for (int i = n; i >= 1; i--) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        //Inverted pyramid 180
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){ //outer loop for rows

            //inner loop -> space
            for(int j =1 ; j<=n-i; j++){
                System.out.print(" ");
            }
            //inner loop -> star
            for(int j =1; j<=i; j++){
                System.out.print("*");
            }

            System.out.println();
        }


    }
}
