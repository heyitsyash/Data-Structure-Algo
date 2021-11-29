package Recursion;

//QUES PRINT ALL THE COMBINATION OF THE STRING
public class PrintPermutation {
    public static void main(String[] args) {

        String str = "abc";

        printPermutation(str,"");
    }

    static void printPermutation(String str, String permutation) {

        if(str.length() == 0){ // if the str == 0 means no string is left then print the permutation
            System.out.println(permutation);
            return;
        }

        for (int i = 0; i < str.length(); i++) { //traversing the str to get the first char to put in the combination formed

            char currChar = str.charAt(i); //here we get that char ex-> b for i =1

            String newString = str.substring(0, i) + str.substring(i + 1); //here we get the char before and after that currChar -> a + c

            printPermutation(newString, permutation + currChar); //now we again call the fun for newString(bc) and permu(a)
            //which will again find the comb for bc and put the first char again in permutation
        }
    }

}

