/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int maxDiameter = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        processDiameter(root);
        return maxDiameter;
    }

    private int processDiameter(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int right = processDiameter(root.right);
        int left = processDiameter(root.left);
        maxDiameter = Integer.max(maxDiameter, left + right);
        return 1 + Integer.max(right, left);
    }
}