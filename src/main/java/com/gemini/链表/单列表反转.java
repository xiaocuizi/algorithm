package com.gemini.链表;


/**
 * todo (用一句话描述该文件做什么)
 *
 * @author xiaocuizi
 * @since 0.0.1 2020/5/10 11:01
 */
public class 单列表反转 {

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


    // todo 删除一个链表节点 ，O(1)的时间复杂度
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
