package practise;

import java.util.Scanner;

public class AutobiographicalNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        System.out.println(getNumber(s));
    }

    static int getNumber(String str){

        if(str == null) return -1;

        int arr[] = new int[10];

        for(int i =0;i<str.length();i++){
            arr[str.charAt(i) - '0']++;
        }

        for (int i=0; i<str.length();i++){
            if(arr[i] != str.charAt(i) -'0') return 0;
        }

        int count = 0;
        for (int i =0; i<str.length(); i++){
            if(arr[i] > 0)count++;
        }

        return count;
    }
}
