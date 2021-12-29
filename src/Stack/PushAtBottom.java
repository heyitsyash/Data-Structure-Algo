package Stack;

import java.util.Stack;

public class PushAtBottom {

    public static void main(String[] args) {

        Stack<Integer> s = new Stack<>();

        s.push(4);
        s.push(9);
        s.push(3);

        pushData(1,s);

        while (!s.isEmpty()){
            System.out.println(s.pop());
        }
    }

    //logic -> while moving upward in the recursion stack we remove the stack elements and store it
    //and finally when the stack is empty(base case) we push our data and while returning we add our elements back
    public static void pushData(int data , Stack<Integer> s){

        if(s.isEmpty()){
            s.push(data); //base case pushing out data
            return;
        }


        int top = s.pop(); //storing and popping
        pushData(data,s); //again calling for rest Stack
        s.push(top); //while returning pushing our elements back
    }
}
