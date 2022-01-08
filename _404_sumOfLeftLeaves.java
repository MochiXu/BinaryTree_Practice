package BinaryTree;
//计算所有左叶子之和
public class _404_sumOfLeftLeaves {
    public int sumOfLeftLeaves(TreeNode root) {
        if(root==null||(root.left==null&&root.right==null&&root!=null))return 0;

        return subLeftSUM(root,0);
    }
    public int subLeftSUM(TreeNode root,int direction){
        if(root==null)
            return 0;
        if(root.left==null&&root.right==null&&direction==0)
            return root.val;
        //这里不能加else，要不然无法进入递归函数
        return subLeftSUM(root.left,0)+subLeftSUM(root.right,1);
    }
}
