package BitManipulation;

import java.util.Scanner;

public class BitSet {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = 5;
        int position = sc.nextInt();
        System.out.println(getBit(n,position));
    }

    static int getBit(int n, int position){
         int bitMask = 1 << position;

         int result = n & bitMask;
         return result;
    }

    static int setBit(int n, int position){

        int bitMask = 1 << position;

        int result = n | bitMask;
        return result;
    }

    static int clearBit(int n, int position){

        int bitmask = ~(1 << position);

        int result = n & bitmask;

        return result;
    }

    static int updateBit(int n, int position, int setTo){

        if(setTo == 1){
            setBit(n,position);
        }else {
            clearBit(n,position);
        }

        return 1;
    }
}
