package Recursion;

//QUES Remove Duplicate from the String
public class RemoveDuplicates {

    public static boolean[] map = new boolean[26]; //by default, it is false

    public static void main(String[] args) {

        String str =  "abbccddxa";

        removeDuplicates(str,0,"");
    }

    static void removeDuplicates(String str, int idx, String newString) {

        if (idx == str.length()) {
            System.out.println(newString);
            return;
        }

        char currChar = str.charAt(idx);

        if (map[currChar - 'a'] == true) {  //char - char returns int[ a -a = 0 , b -a = 1, z-a = 25] so this will return the post of the char in the map
            removeDuplicates(str, idx + 1, newString);//if the element is already there just call for another index
        } else {
            newString += currChar; // if we find the new char add to the new string
            map[currChar - 'a'] = true; //and marked that post in the map as true so next time we do not add that again
            removeDuplicates(str, idx + 1, newString);
        }
    }
}
