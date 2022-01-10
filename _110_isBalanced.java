package BinaryTree;
//给定一个二叉树，判断它是不是平衡二叉树
public class _110_isBalanced {
    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        int deep_l=maxdepth(root.left);
        int deep_r=maxdepth(root.right);
        if(deep_l-deep_r>2||deep_l-deep_r<-2)
            return false;
        return isBalanced(root.left)&&isBalanced(root.right);
    }
    public int maxdepth(TreeNode node){
        //用于计算树的最大深度
        if(node==null) return 0;
        if(node.left==null&&node.right==null) return 1;
        return Math.max(maxdepth(node.left),maxdepth(node.right))+1;
    }
}
