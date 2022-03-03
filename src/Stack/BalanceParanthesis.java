package Stack;

import java.util.Stack;

public class BalanceParanthesis {
    public static void main(String[] args) {

        String str = "{([])}";

        System.out.println(isBalanced(str));
    }

    //logic -> if the char is opening then put in stack else whether stack would be empty means extra char
    //else it is closed if it is just pop it or else none of the condition is true means it is false
    //at last check for empty because if the str is balance all the closing will pop the open char
    public static boolean isBalanced(String str){


        Stack<Character> s = new Stack<>();

        for(int i=0;i<str.length();i++) {
            char c = str.charAt(i); //getting curr char

            if(c=='{' || c=='[' || c=='('){ //checking for open bracket
                s.push(c);
            }
            else {

                if(s.isEmpty()){ //whether it is empty
                    return false;
                }
                //either they are same closing bracket
                else if((s.peek() == '[' && c==']') || (s.peek() == '{' && c=='}') || (s.peek() == '(' &&  c==')') ){
                    s.pop();
                }
                //if not then false
                else {
                    return false;
                }
            }
        }

        //if is Empty == true
        return s.isEmpty();
    }
}
