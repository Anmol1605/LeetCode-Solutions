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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        postorder(list, root);   // call helper
        return list;             // return result
    }

    public static void postorder(List<Integer> list, TreeNode root) {
        if (root == null) return;

        postorder(list, root.left);   // Left
        postorder(list, root.right);  // Right
        list.add(root.val);           // Root
    }
}
   