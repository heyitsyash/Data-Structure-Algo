package Recursion;

import java.util.Scanner;

//Find first and last ocurence of an element in a String
public class FindOcurence {

    public static int first = -1;
    public static int last = -1;

    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        String str = sc.next();
        char element = sc.next().charAt(0); //way to take input of char

        printOccurence(str,0,element);//index =0 moving from left to right
    }

    static void printOccurence(String str,int index,char element){


        if(index == str.length()){ //when index reached the length of sting
            System.out.println(first);
            System.out.println(last);
            return;
        }

        if(str.charAt(index) == element){ //if char in the string is == element
            if(first == -1) { //if the first is not changed yet means we haven't  find the first occurence
                first = index;
            } //if first is updated then keep updating the last until we find the element in the String
                last = index;

        }

        printOccurence(str,index+1,element); //call the function for the next Index
    }
}
