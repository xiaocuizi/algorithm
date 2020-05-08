package com.gemini.链表;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

/**
 * todo (用一句话描述该文件做什么)
 *
 * @author xiaocuizi
 * @since 0.0.1 2020/5/7 9:29
 */
public class 链表是否有环 {


    public static ListNode check2(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        Map map = new HashMap<>();
        int index = 0;
        while (head !=null){
            if(map.containsKey(head)){
                System.out.println("tail connects to node index"+index);
                return head;
            }
            map.put(head,index++);
            head = head.next;
        }
        return null;
    }


    /**
     * 检查链表是否有环
     * @param head
     * @return
     */
    public static boolean check(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }

        ListNode low = head;
        ListNode fast = head.next;

        int index = 0;
        while (fast != null && fast.next !=null) {
            low = low.next;
            fast = fast.next.next;
            index++;
            if (low.equals(fast)) {
                System.out.println(index);
                return true;
            }
        }
        return false;
    }
}
