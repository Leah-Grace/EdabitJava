package com.LeahGrace.CodeSignal;


/*
%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
    Refactored and Unpolished code from Code Signal Editor
%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%

 */


public class RemoveKFromLinkedList {

    // Singly-linked lists are already defined with this interface:
// class ListNode<T> {
//   ListNode(T x) {
//     value = x;
//   }
//   T value;
//   ListNode<T> next;
// }
//
    ListNode<Integer> solution(ListNode<Integer> head, int k) {

        if (head == null){
            return head; // solves Test 4
        }

        if (head.value == k){
            head = head.next;
            return solution(head, k); // solves Test 3
        }

        ListNode trav = head;

        do {

            if (trav.next.value.equals(k)){
                trav.next = trav.next.next; // defaults to null in test case 5
                return solution(head, k); // solves Test 1 and Test 5
            }

            trav = trav.next;

        } while (trav.next != null); //reach the end of Linked List - - solves Test 2


        return head;
    }








    // Singly-linked lists are already defined with this interface:
// class ListNode<T> {
//   ListNode(T x) {
//     value = x;
//   }
//   T value;
//   ListNode<T> next;
// }
//
    ListNode<Integer> solution(ListNode<Integer> head, int k) {

        if (head == null){
            return head; // solves Test 4
        }

        if (head.value == k){
            head = head.next;
            return solution(head, k); // solves Test 3
        }

        ListNode trav = head;

        do {

            // TEST 5:
            // ITERATES 3X
            // TRAV.VALUE  EQUALS 789
            // TRAV.NEXT SHOULD EQUAL K
            // TRAV.NEXT SHOULD BE SET TO NULL
            System.out.println("Trav.value is " + trav.value);
            System.out.println("Trav.next is " + trav.next.value);
            // System.out.println("Trav.next.next is " + trav.next.next.value);

            System.out.println("Does Traveler travel to value 789 and error because the if statement on line 40 is in fact null?");
            //Object.equals() is null-safe
            System.out.println("*");
    /*
      if (trav.next.value.equals(k) && trav.next.next.equals(null)){ //re-evaluate trav.next.next.equals(null) because the evaluation of the null value to null is causing error
          System.out.println("***");
          trav.next = null; //ends the loop

      } else
      */

            if (trav.next.value.equals(k)){
                System.out.println("**");
                trav.next = trav.next.next;
                return solution(head, k);
            }

            trav = trav.next;

        } while (trav.next != null); //reach the end of Linked List
        return head;
    }






}
