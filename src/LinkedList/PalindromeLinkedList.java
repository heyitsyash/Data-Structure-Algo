package LinkedList;

import java.util.LinkedList;

//QUES https://leetcode.com/problems/palindrome-linked-list/submissions/
//for complete ques refer this
public class PalindromeLinkedList {

   static class ListNode {
        int val;
        ListNode next;

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

   static class Solution {

        //same as MyLinkedList class
        public ListNode reverse(ListNode head){

            ListNode prev = null;
            ListNode curr = head;

            while(curr != null){
                ListNode next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            return prev;
        }

        //logic -> In this we'll take two pointers rabbit and turtle in which rabbit will take 2 steps and turtle will take 1 steps
        //both starting from head if the rabbit's next and nexts next(cause it take 2 steps) is  not null we'll increase the pointer
        //finally when the loop breaks turtle will be in the middle of the ll(try on rough paper)

        public ListNode findMiddle(ListNode head){

            ListNode rabbit = head;
            ListNode turtle = head;

            while(rabbit.next != null && rabbit !=null){
                rabbit = rabbit.next.next;
                turtle = turtle.next;
            }

            return turtle;
        }


        //logic is -> first we find middle of the ll then we'll get the secondHalfStart(SHS) and reverse the ll from SHS
        //and then we'll compare the FHS val with SHS val and increase the pointer
        public boolean isPalindrome(ListNode head) {

            //checking if the ll is empty or 1 element
            if(head == null || head.next == null){
                return true;
            }

            ListNode middle = findMiddle(head);//middle node
            ListNode secondHalfStart = reverse(middle.next); //reversing ll from middle next which will return reversed ll head(last Node)

            ListNode firstHalfStart = head; //first half ll head

            while(secondHalfStart != null){ // looping until the SHS is not null

                if(firstHalfStart.val != secondHalfStart.val){ //if value is not equal
                    return false;
                }

                firstHalfStart = firstHalfStart.next; //else increase the pointer
                secondHalfStart = secondHalfStart.next;
            }
            return true; //if we successfully complete the loop means the ll is palindrome

        }
    }

//    public static void main(String[] args) {
//
//        MyLinkedList ll = new MyLinkedList();
//
//       ll.addLast("A");
//       ll.addLast("b");
//       ll.addLast("c");
//       ll.addLast("b");
//       ll.addLast("A");
//
//        Solution sol = new Solution();
//
//        System.out.println(sol.isPalindrome(ll.head);
//
//
//    }
}
