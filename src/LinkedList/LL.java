package LinkedList;

public class LL {

    Node head;

    class Node {

        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
         }
    }

    public void addNode(int data){

        Node newNode = new Node(data);

        if(head == null) head = newNode;

        Node temp = head;

        while (temp.next != null){
            temp = temp.next;
        }

        temp.next = newNode;
    }

    public void printLL(){

        if(head == null) System.out.println("Empty LL");

        Node temp = head;

        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public void deleteNode(){

        if( head.next == null) head = null;

        Node temp = head;

        while(temp.next.next != null){
            temp = temp.next;
        }

        temp.next = null;
    }
    public void addFirst(int data){

        Node newNode = new Node(data);
        if (head == null) head = newNode;

        newNode.next = head;
        head = newNode;
    }
}
