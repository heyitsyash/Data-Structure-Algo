package problems;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class hashMap {
    public static void main(String[] args) {

        int a = 2;
        int b = 10;
        int c = 1025;

        System.out.println(modPow(a,b,c));

    }

    public static int modPow(int input1, int input2, int input3){



        try{
            double power = Math.pow(input1,input2);

            double res = power%input3;

            return (int)res;
        }catch (Exception e ){
            throw new UnsupportedOperationException("modPow(int input1, int input2 , int input 3)");
        }
    }

}
