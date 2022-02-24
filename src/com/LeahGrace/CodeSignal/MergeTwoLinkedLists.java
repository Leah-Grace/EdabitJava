package com.LeahGrace.CodeSignal;

public class MergeTwoLinkedLists {

    ListNode<Integer> solution(ListNode<Integer> l1, ListNode<Integer> l2) {

        if (l1 == null && l2 == null || l2 == null){
            return l1;
        } else if (l1 == null){
            return l2;
        }

        ListNode<Integer> newList = new ListNode(null);

        ListNode newListPointer = newList;

        ListNode l1Pointer = l1;
        ListNode l2Pointer = l2;

        System.out.println("While Loop");

        while (l1Pointer != null && l2Pointer != null) {

            if (l1Pointer == null){
                System.out.println("Point to " + l2Pointer.value);
            }

            if ((int)l1Pointer.value < (int)l2Pointer.value){
                System.out.println(l1Pointer.value);
                l1Pointer = l1Pointer.next;

            }

            if ((int)l2Pointer.value < (int)l1Pointer.value){
                System.out.println(l2Pointer.value);
                l2Pointer = l2Pointer.next;
                if (l2Pointer == null){
                    System.out.println("Point to " + l1Pointer.value);
                }
            }


       /*
       if ((int)l2Pointer.value == (int)l1Pointer.value){
           System.out.println(l1Pointer.value);
           l1Pointer = l1Pointer.next;
           System.out.println(l2Pointer.value);
           l2Pointer = l2Pointer.next;
       }



       if (l2Pointer == null){
           System.out.println("Point to " + l1Pointer.value);
       }
       */

        }



        return newList;


    }

}
