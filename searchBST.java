/**
 * 700. Search in a Binary Search Tree
 * 
 *Given the root node of a binary search tree (BST) and a value.
 *You need to find the node in the BST that the node's value equals the given value.
 * Return the subtree rooted with that node. If such node doesn't exist, you should return NULL.
 */

public class searchBST {
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null) return null;

        if (root.val == val ) return root;

        return (val > root.val)? searchBST(root.right, val) : searchBST(root.left, val);

    }
}
