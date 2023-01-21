package leetcode;

import problems.Solution;

public class MyLL {

    public Node head;
    public int size;

    MyLL(){
        this.size =0;
    }

    class Node {

        String data;
        Node next;


        Node(String data){
           this.data = data;
           this.next = null;
           size++;
        }
    }

    public void addFirst(String data){

        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            return;
        }

        Node curr = head;

        while(curr.next != null){
            curr = curr.next;
        }

        curr.next = newNode;

    }

    public void printList(){

        if(head == null){
            System.out.println("List is Empty");
            return;
        }
        Node curr = head;
        while(curr != null) {
            System.out.print(curr.data  + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public void deleteFirst(){

        if(head == null){
            System.out.println("list is empty");
            return;
        }
        size--;
        head = head.next;

    }

    public void deleteLast(){

        if(head == null){
            System.out.println("List is Empty");
            return;
        }

        size--;
        if(head.next == null){
            head =null;
            return;
        }

        Node secondLast = head;

        while (secondLast.next.next != null){
            secondLast = secondLast.next;
        }

        secondLast.next= null;
    }


    public static void main(String[] args) {
       MyLL ll = new MyLL();

       ll.addFirst("is");
       ll.addFirst("this");
       ll.addLast("a");
       ll.addLast("list");

       ll.printList();
        System.out.println(ll.size);
        ll.deleteFirst();
        ll.printList();
        System.out.println(ll.size);

        ll.deleteLast();
        ll.printList();
        System.out.println(ll.size);
    }
}
