package BinaryTree;


public class _101_isSymmetric {
    public boolean isSymmetric(TreeNode root) {
        return checklr(root,root);
    }
    //不要陷入具体的递归细节，把握递归出口以及递归函数
    public boolean checklr(TreeNode left,TreeNode right){
        //递归出口
        if(left==null||right==null)
            return left==null&&right==null?true:false;
        //递归出口+递归函数
        return left.val==right.val&&checklr(left.right,right.left)&&checklr(left.left,right.right);
    }
}
