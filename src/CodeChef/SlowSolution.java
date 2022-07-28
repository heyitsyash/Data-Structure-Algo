package CodeChef;

import java.util.Scanner;

public class SlowSolution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-->0){

            int maxT = sc.nextInt();
            int maxN = sc.nextInt();
            int sumN = sc.nextInt();

            maxIteration(maxT,maxN,sumN);
        }
    }

    public static void maxIteration(int maxT, int maxN, int sumN){

        int result =0;

        int countMax = sumN/maxN;

        if(maxT > countMax){

            int rem = sumN%maxN;
            int x =0;
            if(rem > 0){
                x = rem;
            }
            result = countMax * (maxN * maxN) + (x * x);

        }else {
            result = maxT * (maxN * maxN);
        }

        System.out.println(result);
    }
}
