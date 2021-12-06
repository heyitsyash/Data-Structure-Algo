package LinkedList;

import java.util.LinkedList;

//QUES https://leetcode.com/problems/remove-nth-node-from-end-of-list/submissions/

//for proper question go refer to the link
public class DeleteNthNode {

    //node class
    class ListNode {
        int val;
        ListNode next;

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        public ListNode removeNthFromEnd(ListNode head, int n) {

            //if there is only one element
            if (head.next == null) {
                return null;
            }

            //getting the size
            ListNode curr = head;
            int size = 0;
            while (curr != null) {
                curr = curr.next;
                size++;
            }

            //if n is equal to size means from nth node from end will be the head so just remove head and assign head to next
            if (n == size) {
                return head.next;
            }

            //here removing nth node by getting the prev index of the node to be removed(size -n)
            int indexToSearch = size - n; // prev index of the node to be removed
            ListNode prev = head;//stating prev node with head
            int i = 1; //i =1 cause starting from head
            while (i < indexToSearch) { //looping until i < index
                prev = prev.next;
                i++;
            }

            //after getting the prev node just assign its next to his nexts next
            prev.next = prev.next.next;
            return head;

        }
    }

    public static void main(String[] args) {

        LinkedList<Integer> ll = new LinkedList<>();


        ll.add(2);
        ll.add(5);
        ll.add(3);
        ll.add(7);
        ll.add(9);


    }

}


