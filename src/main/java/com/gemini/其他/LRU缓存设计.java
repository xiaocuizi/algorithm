package com.gemini.其他;

/**
 * todo (用一句话描述该文件做什么)
 *
 * @author xiaocuizi
 * @since 0.0.1 2020/5/10 21:58
 */
public class LRU缓存设计 {

    static class Node{
        int val;
        Node next;
        Node pre;

        public Node(int val) {
            this.val = val;
        }
    }
}
