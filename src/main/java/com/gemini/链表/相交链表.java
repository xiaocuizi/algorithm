package com.gemini.链表;

/**
 * https://leetcode-cn.com/problems/intersection-of-two-linked-lists/
 *
 * @author xiaocuizi
 * @since 0.0.1 2020/5/10 22:13
 */
public class 相交链表 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null) {
            return headB;
        }
        if (headB == null) {
            return headA;
        }
        int contA = 0;
        int contB = 0;
        while (headA != null) {
            contA++;
            headA = headA.next;
        }
        while (headB != null) {
            contB++;
            headB = headB.next;
        }
        if (contA > contB) {
            while (headA != null) {
                if (headA.val == headB.val) {
                    System.out.print("Reference of the node with value = " + headB.val);
                    return headB;
                } else {
                    headA = headA.next;
                    headB = headB.next;
                }
            }
        } else {
            while (headB != null) {
                if (headA.val == headB.val) {
                    System.out.print("Reference of the node with value = " + headB.val);
                    return headB;
                } else {
                    headA = headA.next;
                    headB = headB.next;
                }
            }
        }
        return null;
    }
}
