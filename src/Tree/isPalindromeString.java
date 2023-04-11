package Tree;

import java.util.Scanner;

public class isPalindromeString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s  = sc.nextLine();

        boolean check = isPalindrome(s.trim());

        if(check){
            System.out.println("The String is a palindrome");
        }else{
            System.out.println("The String is not a Palindrome");
        }
    }

    public static boolean isPalindrome(String s ){

        int i =0;
        int j = s.length() -1;

        while(i < j){

            if(!Character.isLetter(s.charAt(i)))i++;
            if(!Character.isLetter(s.charAt(j))) j--;

            if(s.toLowerCase().charAt(i++) != s.toLowerCase().charAt(j--)) return false;
        }

        return true;
    }
}
