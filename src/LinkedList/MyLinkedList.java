package LinkedList;

public class MyLinkedList {

    //everytime while creating the new list the head is pointing to null
    Node head;
    private int size;

    MyLinkedList(){
        this.size =0;
    }

    class Node {

        //initializing node class
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    public void addFirst(String data) {

        Node newNode = new Node(data); //node which has to be added

        if (head == null) { //checking whether the list is empty or not
            head = newNode;
            return;
        }


        //if not
        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }


        Node currNode = head; //storing the head in curr so that head is not lost

        while (currNode.next != null) { //traversing the list
            currNode = currNode.next;
        }

        currNode.next = newNode; //adding node to the end
    }

    public void printList() {

        Node currNode = head;

        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }

        System.out.println("NULL");
    }

    public void deleteFirst() {

        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        size--;
        head = head.next;

    }

    public void deleteLast() {

        if (head == null) {
            System.out.println("list is empty");
            return;
        }

        size--;
        if(head.next == null){
            head = null;
            return;
        }

        Node secondLast = head;

        while(secondLast.next.next != null){
            secondLast = secondLast.next;
        }

        secondLast.next =null;
    }

    public void getSize(){
        System.out.println(size);
    }

    public void reverse(){

        //we take 3 pointers prev->null(initially) curr->head, and then we create temp->curr.next then we'll loop until curr!=null
        //and when curr points to null we'll assign head to prev (last node)
        Node curr = head;
        Node prev = null;

        while (curr != null){
            Node temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        head = prev;

    }


    public static void main(String[] args) {

        MyLinkedList ll = new MyLinkedList();
        ll.addFirst("a");
        ll.addFirst("is");
        //ll.printList();

        ll.addLast("list");
        ll.addFirst("this");

//        ll.getSize();
//        ll.printList();
//
//        ll.deleteFirst();
//        ll.printList();
//
//        ll.deleteLast();
//        ll.printList();
//
//        ll.getSize();

//        ll.printList();
//        ll.reverse();
        ll.printList();

        ll.reverse();
        ll.printList();

    }

}
