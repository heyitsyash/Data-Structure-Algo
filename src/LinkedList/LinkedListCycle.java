package LinkedList;

import java.util.List;

public class LinkedListCycle {


    //node class
    class ListNode {
        int val;
       ListNode next;

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    //FLOYD'S CYCLE ALGORITHM( hare turtle algo)
    public ListNode detectCycle(ListNode head){

        if(head == null){ //if the list is empty
            return null;
        }

        ListNode hare = head;
        ListNode  turtle = head;

        //mathematically if at any point in list hare turtle meets means it has loop
        while(hare != null && hare.next !=null){

            hare = hare.next.next; //moving the pointers
            turtle = turtle.next;

            if(hare == turtle){ //if it meets return the node(turtle/hare)
                return turtle;
            }
        }

        return null; //otherwise return null

    }

    //to detect the starting node of the loop
    public ListNode detectLoopStartingNode(ListNode head){

        ListNode meet = detectCycle(head); //here we'll get the meeting point of the hare and turtle in the loop of list
        ListNode start = head; //we'll take another pointer from head

        while(start != meet){ //mathematically start and meet will meet at a point in the list and that point is the start of loop in list
            start = start.next;
            meet = meet.next;
        }

        return start; //returning the start
    }
}
