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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        } else if (p == null || q == null) {
            return false;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(p);

        Queue<TreeNode> queue2 = new LinkedList<>();
        queue2.offer(q);

        while (!queue.isEmpty() && !queue2.isEmpty()) {
            TreeNode temp = queue.poll();
            TreeNode temp2 = queue2.poll();

            if (temp == null || temp2 == null || temp.val != temp2.val) {
                return false;
            }

            if (temp.left != null || temp2.left != null) {
                queue.offer(temp.left);
                queue2.offer(temp2.left);
            } 
            if (temp.right != null || temp2.right != null) {
                queue.offer(temp.right);
                queue2.offer(temp2.right);
            }
        }

        return true;
    }
}