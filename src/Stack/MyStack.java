package Stack;

import java.util.ArrayList;

public class MyStack {

    public static void main(String[] args) {

        LinkedListStack s = new LinkedListStack();
        s.push(2);
        s.push(4);
        s.push(5);

        while (!s.isNull()) {
            System.out.print(s.peek() + " ");
            s.pop();
        }

        System.out.println();


        ArrayListStack arr = new ArrayListStack();

        arr.push(4);
        arr.push(5);
        arr.push(6);
        arr.push(7);

       while (!arr.isEmpty()){
           System.out.print(arr.peek() + " ");
           arr.pop();
       }
    }

    static class Node{

        int data;
        Node next;

        public Node(int data){
            this.data = data;
            next = null;
        }
    }

    //Stack Implementation with LinkedList
    static class LinkedListStack {

        public static Node head;

        public static boolean isNull(){
            return head == null;
        }

        public static void push(int data){
            Node newNode = new Node(data);

            if(isNull()){
               head = newNode;
               return;
            }
            newNode.next = head;
            head = newNode;
        }

        public static int pop(){
            if(isNull()){
                return -1;
            }

            int data = head.data;
            head = head.next;
            return data;
        }

        public static int peek(){
            if(isNull()){
                return -1;
            }

            int data = head.data;
            return data;
        }
    }

    //stack implementation with ArrayList
    static class ArrayListStack {

        static ArrayList<Integer> list = new ArrayList<>();

        public static boolean isEmpty(){
            return list.size() == 0;
        }

        public static void push(int data){

            list.add(data);
        }

        public static int pop(){
            if(isEmpty()){
                return -1;
            }

            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }

        public static int peek(){

            return list.get(list.size()-1);
        }
    }
}
