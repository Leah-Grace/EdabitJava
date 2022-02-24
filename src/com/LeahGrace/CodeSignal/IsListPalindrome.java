package com.LeahGrace.CodeSignal;

import java.util.ArrayList;
import java.util.List;

public class IsListPalindrome {


    boolean solution(ListNode<Integer> head) {
    /*
    first and last values must be identical?
    if the list in reverse == list then true?
    if list is size of 1 return true
    if list empty return true
    */
        List<Integer> newList1 = new ArrayList<>();
        List<Integer> newList2 = new ArrayList<>();
        ListNode previous = null;
        ListNode current = head;

        while (current != null) {
            System.out.println("Current value is " + current.value);
            ListNode next = current.next;
            if (next != null){
                System.out.println("Next is " + next.value);
            } else {
                System.out.println("Next is null");
            }
            newList1.add((int)current.value);

            current.next = previous;
            if (current.next != null){
                System.out.println("Current.next is " + current.next.value);
            }
            previous = current;
            if (previous.value != null){
                System.out.println("Previous is now " + previous.value);
            }
            current = next;
        }



        while (previous != null) {
            newList2.add((int)previous.value);
            previous = previous.next;
        }



        if (!newList1.equals(newList2)) {
            return false;

        }


        return true;
    }

}
