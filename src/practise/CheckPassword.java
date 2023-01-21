package practise;

import java.util.Scanner;

public class CheckPassword {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        System.out.println(check(str));
    }

    static boolean check(String str){

        int n = str.length();
        boolean result = false;

        if(n < 4){
            //result = false;
            return result;
        }

        if(str.charAt(0) >= '0' && str.charAt(0) <= '9') return result;

        int count1  = 0;
        int count2 = 0;
        for(int i =0; i<n;i++){

            if(str.charAt(i) == ' ' || str.charAt(i) == '/') return result;
            else if(str.charAt(i) >= '0' && str.charAt(i) <= '9') count1++;
            else if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') count2++;
        }

        if (count1 < 1) return result;
        if(count2 < 1) return result;

        return true;

    }
}
