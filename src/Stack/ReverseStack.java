package Stack;

import java.util.Stack;

public class ReverseStack {
    public static void main(String[] args) {


        Stack<Integer> s = new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);


        reverse(s);
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }


    }

    static void pushAtBottom(int data, Stack<Integer > s){

        if (s.isEmpty()) {
            s.push(data); //base case pushing out data
            return;
        }


        int top = s.pop(); //storing and popping
        pushAtBottom(data, s); //again calling for rest Stack
        s.push(top); //while returning pushing our elements back
    }


    public static void reverse (Stack <Integer> s) {

        if(s.isEmpty()){
            return;
        }

        int top = s.pop();
        reverse(s);
        pushAtBottom(top, s);
    }
}
