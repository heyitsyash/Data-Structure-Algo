package Recursion;

import java.util.HashSet;
//QUES PRINT ALL THE UNIQUE SUBSEQUENCE OF A STRING
public class UniqueSubsequenceString {
    public static void main(String[] args) {

        String str = "aaa";

        HashSet<String> set =  new HashSet<>();
         uniqueSubsequence(str,0,"",set);
    }

    static void uniqueSubsequence(String str, int idx, String newString, HashSet<String> set) {

        if (idx == str.length()) {
            if (set.contains(newString)) { //if it already contains the char
                return;
            } else {
                System.out.println(newString); //if not then print
                set.add(newString); // and then add in the set ,so it should not print again (set contains unique elements)
                return;
            }
        }

        char currChar = str.charAt(idx);

        uniqueSubsequence(str, idx + 1, newString + currChar, set);

        uniqueSubsequence(str, idx + 1, newString, set);
    }
}
