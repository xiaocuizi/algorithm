package com.gemini.树;


import com.gemini.tree.TreeTest;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

/**
 * todo (用一句话描述该文件做什么)
 *
 * @author xiaocuizi
 * @since 0.0.1 2020/5/9 19:27
 */
public class 树的层级遍历 {

    public static void main(String[] args) {
        Node root = new Node(1);
        Node rootLeft = new Node(2);
        Node rootRight = new Node(3);
        root.left = rootLeft;
        root.right = rootRight;

        rootLeft.left = new Node(4);
        rootLeft.right = new Node(5);







        // levelOder2(root,new Visitor(){
        //     @Override
        //     public void visit(Integer e) {
        //         System.out.println(e);
        //     }
        // });
        preOrderTraverse(root);
        System.out.println("\n----------");
        preOrderIter(root);
    }

    /**
     * 前序遍历 -- 递归
     *
     * @param root
     */
    public static void preOrderTraverse(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.val);
        preOrderTraverse(root.left);
        preOrderTraverse(root.right);
    }

    /**
     * 迭代
     *
     * @param root
     */
    public static void preOrderIter(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.val);
        Node left = root.left;
        Node right = root.right;
        while (left != null) {
            System.out.print(left.val);
            left = left.left;
        }
        // preOrderTraverse(root.left);
        // preOrderTraverse(root.right);
        while (right != null) {
            System.out.print(right.val);
            right = right.right;
        }

    }

    // 访问者模式
    static interface Visitor {
        /**
         * 访问元素
         *
         * @param e
         */
        void visit(Integer e);
    }

    static void test() {

    }

    public static void levelOder2(Node root, Visitor visitor) {
        if (root == null || visitor == null) {
            return;
        }
        Stack<Node> stack = new Stack<Node>();
        stack.push(root);
        while (!stack.isEmpty()) {
            Node poll = stack.pop();
            visitor.visit(poll.val);

            if (poll.right != null) {
                stack.push(poll.right);
            }

            if (poll.left != null) {
                stack.push(poll.left);
            }

        }
    }

    /**
     * 层级遍历一
     *
     * @param root
     * @param vistor
     */
    public static void levelOder(Node root, Visitor vistor) {
        if (root == null) {
            return;
        }
        Queue<Node> queue = new LinkedList<Node>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            Node poll = queue.poll();
            vistor.visit(poll.val);
            if (poll.left != null) {
                queue.offer(poll.left);
            }

            if (poll.right != null) {
                queue.offer(poll.right);
            }
        }
    }

    static class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }
    }


}
