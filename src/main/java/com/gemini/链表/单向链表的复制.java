package com.gemini.链表;

import jdk.internal.org.objectweb.asm.Handle;

import java.util.HashMap;
import java.util.Map;

/**
 * todo (用一句话描述该文件做什么)
 *
 * @author xiaocuizi
 * @since 0.0.1 2020/5/10 21:52
 */
public class 单向链表的复制 {

    public RandomListNode copy(RandomListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        Map<RandomListNode, RandomListNode> map = new HashMap<>();

        RandomListNode sourceNode = head;
        while (sourceNode != null) {
            RandomListNode node = new RandomListNode(sourceNode.label);
            map.put(sourceNode, node);
            sourceNode = sourceNode.next;
        }
        sourceNode = head;
        RandomListNode newNode = null;
        while (sourceNode != null) {
            newNode = map.get(sourceNode);
            newNode.next = map.get(sourceNode.next);
            newNode.random = map.get(sourceNode.random);
            sourceNode = sourceNode.next;
        }

        return newNode;


    }


    static class RandomListNode {
        int label;
        RandomListNode next;
        RandomListNode random;

        public RandomListNode(int label) {
            this.label = label;
        }
    }
}
