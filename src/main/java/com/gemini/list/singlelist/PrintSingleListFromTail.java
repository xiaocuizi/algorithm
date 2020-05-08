package com.gemini.list.singlelist;

import javax.management.ListenerNotFoundException;
import javax.validation.constraints.Max;
import java.util.Stack;

/**
 * todo (用一句话描述该文件做什么)
 *
 * @author xiaocuizi
 * @since 0.0.1 2020/5/5 19:49
 */
public class PrintSingleListFromTail {


    public static void main(String[] args) {
        ListNode node1 = new ListNode(3);
        ListNode node2 = new ListNode(6);
        ListNode node3 = new ListNode(9);
        node1.next = node2;
        node2.next = node3;
        print(node1);
    }

    public static void print(ListNode head) {

        if (head == null || head.next == null) {
            return;
        }
        Stack<ListNode> listNodeStack = new Stack<>();

        while (head != null) {
            listNodeStack.push(head);
            head = head.next;
        }

        while (!listNodeStack.isEmpty()) {
            System.out.println(listNodeStack.pop().val);
        }

    }


    private static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
