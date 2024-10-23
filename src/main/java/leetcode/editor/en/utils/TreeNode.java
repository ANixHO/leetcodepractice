package leetcode.editor.en.utils;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode() {
    }

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public TreeNode(Integer[] array) {
        arrayToTreeNode(array);
    }

    public TreeNode arrayToTreeNode(Integer[] array) {
        if (array.length == 0) {
            return null;
        }
        TreeNode root = new TreeNode(array[0]);
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        boolean isLeft = true;
        for (int i = 1; i < array.length; i++) {
            TreeNode node = queue.peek();
            if (isLeft) {
                node.left = new TreeNode(array[i]);
                queue.offer(node.left);
                isLeft = false;
            } else {
                node.right = new TreeNode(array[i]);
                queue.offer(node.right);
                queue.poll();
                isLeft = true;
            }
        }
        return root;
    }
}

