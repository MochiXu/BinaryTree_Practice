package BinaryTree;

public class _112_hasPathSum {
    public boolean hasPathSum(TreeNode root, int targetSum) {


        if(root!=null&&root.val==targetSum&&root.right==null&&root.left==null){
            return true;
        }
        if (root==null)
            return false;

        return hasPathSum(root.left,targetSum-root.val)||hasPathSum(root.right,targetSum- root.val);
    }
}
