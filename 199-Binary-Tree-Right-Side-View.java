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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> rightValues = new ArrayList<>();
        Queue<TreeNode> nodes = new LinkedList<>();
        nodes.offer(root);
        while (!nodes.isEmpty()) {
            Integer rightValue = null;
            for (int i = nodes.size(); i > 0 ; i--) {
                TreeNode node = nodes.poll();
                if (node != null) {
                    rightValue = node.val;
                    nodes.offer(node.left);
                    nodes.offer(node.right);
                }
            }
            if (rightValue != null) {
                rightValues.add(rightValue);
            }
        }
        return rightValues;
    }
}