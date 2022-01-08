package BinaryTree;
//递归-二叉树
public class _104_maxDepth {
    //不要陷入具体的递归细节
    public int maxDepth(TreeNode root) {
        //递归出口/边界判断
        if(root==null)
            return 0;
        //递归函数-递归出口
        int i=maxDepth(root.left);
        int j=maxDepth(root.right);
        return i>j?i+1:j+1;
    }
}
