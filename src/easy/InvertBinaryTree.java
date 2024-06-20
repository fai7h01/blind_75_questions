package easy;


public class InvertBinaryTree {

    public static TreeNode invertTree(TreeNode root){

        if (root == null) return root;

        TreeNode leftTree = invertTree(root.left);
        TreeNode rightTree = invertTree(root.right);

        root.left = rightTree;
        root.right = leftTree;

        return root;

    }
}
