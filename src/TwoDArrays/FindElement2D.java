package TwoDArrays;

import java.util.Scanner;


public class FindElement2D {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int colos = sc.nextInt();

        int arr[][] = new int[rows][colos];

        for (int i=0; i<rows;i++){
            for(int j=0; j<colos;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int n = sc.nextInt();


        int number = sc.nextInt();

        for (int i=0; i<rows;i++){
            for(int j=0; j<colos;j++){
                if(arr[i][j] == number){
                    System.out.println("Number found at " + i +  ", " + j);
                }
            }
        }
    }
}
