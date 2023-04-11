package Recursion;

public class ReverseString {

    public static void main(String[] args) {

        String str = "love babbar";

        char[] arr = str.toCharArray();

        for (char c : arr){
            System.out.print(c + " ");
        }
        System.out.println();
        reverse(arr,0,str.length()-1);

        for (char c : arr){
            System.out.print(c + " ");
        }
    }

    public static void reverse(char[] str,int i,int j){


        if(i > j)return;

        char c = str[i];
        str[i] = str[j];
        str[j] = c;

        reverse(str,++i,--j);
    }
}
