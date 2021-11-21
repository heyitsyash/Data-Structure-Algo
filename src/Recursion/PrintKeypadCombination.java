package Recursion;

public class PrintKeypadCombination {

    //QUES PRINT THE COMBINATION CAN BE FORMED WHILE PRESSING(STRING 23) IN THE NUMBER PAD KEYPAD
    public static String[] keypad = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};//num keypad

    public static void main(String[] args) {

        String str = "23"; //numbers pressed
        keypadCombination(str, 0, "");

    }

    static void keypadCombination(String str, int idx, String combination) {

        if (idx == str.length()) {
            System.out.println(combination);
            return;
        }
        char currChar = str.charAt(idx); //here we are getting the first number pressed(ex 2 in 23)

        String mapping = keypad[currChar - '0']; //then we are getting the alphabets present at that number in our keypad(any numberString - anotherNumberString returns int) -> returns 2(def)

        for (int i = 0; i < mapping.length(); i++) { //traversing def
            keypadCombination(str, idx + 1, combination + mapping.charAt(i)); //forming the combination
        }
    }
}
