package BinaryTree;


public class _101_isSymmetric {
    public boolean isSymmetric(TreeNode root) {
        
    }
    public void revert(TreeNode root){
        //二叉树镜像翻转
        if(root==null)
            return;
        TreeNode temp=root.left;
        root.left=root.right;
        root.right=temp;
        revert(root.left);
        revert(root.right);
    }
}
