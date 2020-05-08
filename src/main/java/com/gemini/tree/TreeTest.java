package com.gemini.tree;

import java.util.LinkedList;

/**
 * todo (用一句话描述该文件做什么)
 *
 * @author xiaocuizi
 * @since 0.0.1 2020/4/29 14:23
 */
public class TreeTest {

    public static void main(String[] args) {
        Node root = new Node(1);

        Node left = new Node(2);
        left.left = new Node(4);


        root.left = left;
        Node node = new Node(3);
        node.right = new Node(5);
        root.right = node;
        iter(root);
        // preOrderTraverse(root);
    }

    public static void preOrderTraverse(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.val);
        preOrderTraverse(root.left);
        preOrderTraverse(root.right);
    }

    public static void iter(Node root) {
        if (root == null) {
            return;
        }
        short level = 1;
        LinkedList<Node> nodes = new LinkedList<Node>();
        nodes.add(root);
        System.out.print("level "+level +":");
        while (!nodes.isEmpty()) {
            Node poll = nodes.poll();
            System.out.print("\nlevel "+level++ +":"+poll.val);
            if (poll.left != null) {
                nodes.add(poll.left);
            }
            if (poll.right != null) {
                nodes.add(poll.right);
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
