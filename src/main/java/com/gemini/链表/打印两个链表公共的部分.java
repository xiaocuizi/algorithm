package com.gemini.链表;

/**
 * todo (用一句话描述该文件做什么)
 *
 * @author xiaocuizi
 * @since 0.0.1 2020/5/7 13:15
 */
public class 打印两个链表公共的部分 {


    public static void print(ListNode<Integer> head1, ListNode<Integer> head2) {

        if (head1 == null || head2 == null) {
            return;
        }
        while (head1 != null && head2 != null) {
            if (head1.val < head2.val) {
                head1 = head1.next;
            } else if (head1.val > head2.val) {
                head2 = head2.next;
            } else {
                System.out.println(head1.val);
                head1 = head1.next;
                head2 = head2.next;
            }
        }

    }
}
