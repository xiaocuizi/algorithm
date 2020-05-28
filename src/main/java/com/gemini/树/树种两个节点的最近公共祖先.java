package com.gemini.树;

import sun.reflect.generics.tree.Tree;

/**
 * todo (用一句话描述该文件做什么)
 *
 * @author xiaocuizi
 * @since 0.0.1 2020/5/10 11:05
 */
public class 树种两个节点的最近公共祖先 {

    public static TreeNode commonNode(TreeNode root, TreeNode node1, TreeNode node2) {
        if (root == null || node1 == null || node2 == null) {
            return root;
        }

        TreeNode left = commonNode(root.left, node1, node2);
        TreeNode right = commonNode(root.right, node1, node2);
        if (left != null && right != null) {
            return root;
   }
        return left != null ? left : right;


    }
}
