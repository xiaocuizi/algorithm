package com.gemini.list.singlelist;

/**
 * 单列表反转
 *
 * @author xiaocuizi
 * @since 0.0.1  2020/3/25 10:24
 */
public class SingleList {


    /**
     * head ->5 -> 4 -> 3 -> 2 -> 1
     * ^
     * |
     * head -> 1 -> 2 -> 3 -> 4 -> 5
     * 单列表反转
     *
     * @param head
     * @return
     */
    public ListNode reverse(ListNode head) {
        ListNode newHead = null;
        ListNode cur = null;
        while (head != null) {
            cur = head.next;
            head.next = newHead;
            newHead = head;
            head = cur;
        }
        return newHead;
    }

    public ListNode delNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
        return node;
    }

    private class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }


}

