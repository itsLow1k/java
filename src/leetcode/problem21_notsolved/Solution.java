package leetcode.problem21_notsolved;

import java.util.ArrayList;
import java.util.Collections;

class ListNode {
    private int data;
    private ListNode next;

    public ListNode(int data) {
        this.data = data;
        this.next = null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }
}

public class Solution {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        while (list1 != null) {
            if (list1.getData() <= list2.getData()){
                list2.setData(list1.getData());
            }
            list1 = list1.getNext();
        }
        return list2;
    }
    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        ListNode second = new ListNode(3);
        ListNode third = new ListNode(5);
        list1.setNext(second);
        second.setNext(third);

        ListNode list2 = new ListNode(1);
        ListNode second2 = new ListNode(2);
        ListNode third2 = new ListNode(2);
        list2.setNext(second2);
        second2.setNext(third2);

        mergeTwoLists(list1, list2);
    }
}

