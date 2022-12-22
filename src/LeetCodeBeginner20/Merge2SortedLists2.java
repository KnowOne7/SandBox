package LeetCodeBeginner20;

import utils.LinkedList;
import utils.LinkedList.*;

import java.util.ArrayList;

import static utils.LinkedList.ListNode.createList;
import static utils.LinkedList.ListNode.printList;

/*
https://leetcode.com/problems/delete-node-in-a-linked-list/discuss/654837/listnode-class-implementation-for-java
 */

public class Merge2SortedLists2 {
    public static void main(String[] args) {
        ListNode list1 = new ListNode();
        list1 = ListNode.insert(list1, 1);
        list1 = ListNode.insert(list1, 2);
        list1 = ListNode.insert(list1, 4);

        ListNode list2 = new ListNode();
        list2 = ListNode.insert(list2, 1);
        list2 = ListNode.insert(list2, 3);
        list2 = ListNode.insert(list2, 4);

        printList(list1);
        printList(list2);
        ListNode list3 = createList(42,2,5,6,7,9);
        printList(list3);
        System.out.println(list3.val);
        System.out.println(list2.val);
        mergeTwoLists(list1, list2);

    }

    private static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if (list1 == null)
            return list2;
        if (list2 == null)
            return list1;

        if (list1.val < list2.val) {
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        } else {
            list2.next = mergeTwoLists(list1, list2.next);
            return list2;
        }
    }
}

//
//
//        ListNode newList = new ListNode(0);
//
//        if(list1.val < list2.val){
//            System.out.println(" 1 is less than 2");
//            newList = list1;
//            printList(newList);
//        }
//        else{
//            System.out.println("2 is greater than or equal to one.");
//            newList.next = list2;
//            printList(newList);
//            list2 =list2.next;
////            printList(list2);
//            printList(newList);
//        }
//    }
//}
