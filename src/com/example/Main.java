package com.example;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
	    ListNode a = new ListNode(1);
        ListNode b = new ListNode(1);
        ListNode c = new ListNode(1);
        ListNode d = new ListNode(1);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = a;
        System.out.println(hasCycle(a));
    }

    public static boolean hasCycle(ListNode head){
        Set<ListNode> listNodeSet = new HashSet<>();
        while(head!=null){
            if (!listNodeSet.contains(head)){
                listNodeSet.add(head);
                head = head.next;
            } else {
                return true;
            }
        }
        return false;
    }

}
