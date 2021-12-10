package LinkedList;
//QUES DUPLICATE A LL WITH RANDOM POINTERS
//https://www.geeksforgeeks.org/clone-linked-list-next-random-pointer-o1-space/

public class CloneLLRandomPointer {

    // Structure of linked list Node
    static class Node {
        int data;
        Node next, random;
        Node(int x)
        {
            data = x;
            next = random = null;
        }
    }

    //logic -> first we assign the same nodes pointing to their next which creates a copy of ll
    //eg {2->2->5->5->9->9} then we'll assign the random pointers to the new nodes and at the ned we'll differ both ll
    static Node clone(Node head){

        //adding new Nodes
        Node curr = head;
        while(curr != null){
            Node temp = curr.next; //saving orig ll curr next
            curr.next = new Node(curr.data); //add new node with same data to the curr.next
            curr.next.next = temp; //then connecting it's next to the ll
            curr = temp; // moving back to the orig next
        }
        curr = head; //after adding assign head

        //adding random pointers to the new nodes
        while (curr!=null){

            if(curr.next != null){ //check if it's not null
                curr.next.random = (curr.random != null)? curr.random.next : null; //newNodes random = if(orig.random !=null) orig.random.next else null
                curr = curr.next.next; //moving curr forward
            }
        }

        //differentiating original and cloned ll
        Node orig = head;
        Node copy = head.next;
        Node temp = copy;

        while (orig != null){

            orig.next = orig.next.next; //orig next = asli next of ll
            copy.next = (copy.next != null)? copy.next.next : copy.next; //copy next(new node) = new node ka next
            orig = orig.next;
            copy = copy.next;
        }

        return temp;

    }

    static void print(Node start)
    {
        Node ptr = start;
        while (ptr != null) {
            System.out.println("Data = " + ptr.data
                    + ", Random = "
                    + ptr.random.data);
            ptr = ptr.next;
        }
    }

    public static void main(String[] args) {

        Node start = new Node(1);
        start.next = new Node(2);
        start.next.next = new Node(3);
        start.next.next.next = new Node(4);
        start.next.next.next.next = new Node(5);

        // 1's random points to 3
        start.random = start.next.next;

        // 2's random points to 1
        start.next.random = start;

        // 3's and 4's random points to 5
        start.next.next.random = start.next.next.next.next;
        start.next.next.next.random
                = start.next.next.next.next;

        // 5's random points to 2
        start.next.next.next.next.random = start.next;

        System.out.println("Original list : ");
        print(start);

        System.out.println("Cloned list : ");
        Node cloned_list = clone(start);
        print(cloned_list);
    }
}
