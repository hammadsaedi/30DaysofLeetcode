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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root == null)
            return false;
        if(isSametree(root, subRoot)) 
            return true;
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    private boolean isSametree(TreeNode tree1, TreeNode tree2){
        if(tree1 == null || tree2 == null)
            return tree1 == tree2;
        return (tree1.val == tree2.val) && isSametree(tree1.left, tree2.left) && isSametree(tree1.right, tree2.right);
    }
}