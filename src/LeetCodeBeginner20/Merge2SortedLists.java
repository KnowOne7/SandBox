package LeetCodeBeginner20;
import utils.LinkedList;
import utils.LinkedList.*;


/*
You are given the heads of two sorted linked lists list1 and list2.

Merge the two lists in a one sorted list. The list should be made by
splicing together the nodes of the first two lists.

Return the head of the merged linked list.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static utils.LinkedList.ListNode.printList;


public class Merge2SortedLists {
    public static void main(String[] args) {
//        ListNode list1 = {1,2,4};
//        ListNode list2 = (1,3,4);
//        ListNode list1 = new ListNode(1,2,4);
//        ListNode list2 = new ListNode(1,3,4);
//        mergeTwoLists(list1,  list2);
//        LinkedList<ListNode> list1 = new LinkedList<ListNode>(1,2,3,4,5);
//        list1.addAll(Collect);
//        ListNode list1 = Arrays.asList(1,2,4);

//        LinkedList list1 = new LinkedList();
//         list1.insert

        ListNode list1 = new ListNode();
        list1 = ListNode.insert(list1, 1);
        list1 = ListNode.insert(list1, 2);
        list1 = ListNode.insert(list1, 4);

        ListNode list2 = new ListNode();
        list2 = ListNode.insert(list2, 1);
        list2 = ListNode.insert(list2, 3);
        list2 = ListNode.insert(list2, 4);

        mergeTwoLists(list1, list2);

    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//        ListNode pointer = null;
//        printList(pointer);
//
//        ListNode pointer = null;
//        ListNode head = null;
//
//        if(list1.getVal() < list2.getVal()){
//            head = list1;
//            list1 = list1.getNext();
//        }
//        else{
//            head = list2;
//            list2 = list2.getNext();
//        }
//        pointer = head;
//        while((list1 != null) && (list2 != null)){
//            if(list1.getVal() <= list2.getVal() ){
//                pointer.setNext() = list1;
//                list1 = list1.getNext();
//            }
//            else{
//                pointer.getNext() = list2;
//                list2 = list2.getNext();
//            }
////            return pointer;
//        }


//        if (list1.getVal() < list2.getVal()) {
//            list1.getNext() = mergeTwoLists(list1.getNext(), list2);
//            return list1;
//        } else {
//            list2.getNext() = mergeTwoLists(list1, list2.getNext());
//            return list1;
//        }

//        LinkedList.ListNode.printList(pointer);
//
//        return pointer;
//    }
//}
//public class LinkedList {

        return list1;
    }
}


//}