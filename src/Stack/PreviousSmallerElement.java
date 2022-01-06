package Stack;

import java.util.ArrayList;
import java.util.Stack;

public class PreviousSmallerElement {

    public static void main(String[] args) {


        int arr[] = {4,10,5,18,3,12,7};

        previousSmaller(arr);
        System.out.println();
        nextSmaller(arr);

    }
    //logic -> we'll loop through ar and for every element we'll check if arr is not empty and the previous element is greater
    //then we'll remove that element from the stack and then check for empty(return -1) if not then the element on the top
    //is the previous smaller and then print element and push the ith elem on the stack
    public static void previousSmaller(int arr[]) {

        Stack<Integer> s = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            while (!s.isEmpty() && s.peek() >= arr[i]){ //checking for empty and greater
                s.pop(); //if grater then pop until we find the smaller
            }

            if(s.isEmpty()){ //if somehow the stack becomes empty means no element is smaller
                System.out.print(-1 + " ");
            }else{
                System.out.print(s.peek() + " "); //else the elem on top is smaller
            }

            s.push(arr[i]); //at last push the ith element
        }
    }

    //For Previous Greater Element
    public static void previousGreater(int arr[]) {

        Stack<Integer> s = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            while (!s.isEmpty() && s.peek() <= arr[i]){
                s.pop();
            }

            if(s.isEmpty()){
                System.out.print(-1 + " ");
            }else{
                System.out.print(s.peek() + " ");
            }

            s.push(arr[i]);
        }
    }

    //Next Smaller just iterate from last and to print store in array
    public static void nextSmaller(int arr[]) {

        Stack<Integer> s = new Stack<>();
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = arr.length-1; i>=0; i--) {
            while (!s.isEmpty() && s.peek() >= arr[i]){
                s.pop();
            }

            if(s.isEmpty()){
               ans.add(-1);
            }else{
                ans.add(s.peek());
            }

            s.push(arr[i]);
        }

        for(int i =ans.size()-1; i>=0; i--){
            System.out.print(ans.get(i) + " ");
        }
    }
}


