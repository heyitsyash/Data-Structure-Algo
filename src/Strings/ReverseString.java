package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
//
//        StringBuilder sb = new StringBuilder(sc.nextLine());
//
//
//        for(int i =0; i<sb.length()/2; i++){
//
//            int frontIndex = i;
//            int backIndex = sb.length() - 1 - i;
//
//            char frontChar = sb.charAt(frontIndex);
//            char backChar = sb.charAt(backIndex);
//
//            sb.setCharAt(frontIndex,backChar);
//            sb.setCharAt(backIndex,frontChar);
//        }
//
//        System.out.println(sb);

//       String s[] = {"Flower", "Flow", "Fight","apple"};
//        //Arrays.sort(s);

//        for(int i=0; i<s.length;i++){
//            System.out.println(s[i]);
//        }
//

       String s = sc.nextLine();

        String s1 = s.replaceAll(" ", "");
        String s2 = s1.replaceAll(",","");
        String s3 = s2.replaceAll(":","");
        String s4 = s3.replaceAll("\\.","");
        String str = s4.toUpperCase();

        System.out.println(s3.replaceAll("\\.",""));
//        Character.isLetterOrDigit();
//        int first =0;
//        int last = str.length()-1;
//
//        while(first <= last){
//            if(str.charAt(first) == str.charAt(last)){
//                first++; last--;
//            }else{
//                System.out.println(false);
//            }
//        }
//
//
//        System.out.println(true);

    }
}
