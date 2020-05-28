package com.gemini.树;

import io.lettuce.core.EpollProvider;

import java.util.Stack;

/**
 * todo (用一句话描述该文件做什么)
 *
 * @author xiaocuizi
 * @since 0.0.1 2020/5/11 9:13
 */
public class 树的非递归遍历 {


    /**
     * 前序遍历
     *
     * @param root
     */
    public static void preOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        TreeNode node = root;
        Stack<TreeNode> stack = new Stack<>();
        while (true) {
            if (node != null) {
                System.out.println(node.val);
                if (node.right != null) {
                    stack.push(node.right);
                }
                node = node.left;
            } else {
                if (stack.isEmpty()) {
                    return;
                }
                //
                node = stack.pop();
            }
        }
    }

    /**
     * 中序遍历
     *
     * @param root
     */
    public static void inOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        TreeNode node = root;
        Stack<TreeNode> stack = new Stack<>();
        while (true) {
            if (node != null) {
                stack.push(node);
                // 向左走
                node = node.left;
            } else {
                if (stack.isEmpty()) {
                    return;
                }
                // 弹出栈，并打印
                node = stack.pop();
                System.out.println(node.val);
                // 向右走
                node = node.right;
            }
        }
    }

    /**
     * 后续遍历
     *
     * @param root
     */
    public static void postOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        TreeNode node = root;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
         TreeNode pre = null;
        // while (!stack.isEmpty()) {
        //     TreeNode top = stack.peek();
        //     // 栈顶元素是叶子节点
        //     if ((top.right == null && top.left == null) || (pre !=null && pre.praret = pop) {
        //         TreeNode pop = stack.pop();
        //         pre =   pop;
        //         System.out.println(pop.val);
        //     } else {
        //         if (top.right != null) {
        //             stack.push(top.right);
        //         }
        //
        //         if (top.left != null) {
        //             stack.push(top.left);
        //         }
        //     }
        // }

    }
}
