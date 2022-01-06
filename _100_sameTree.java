package BinaryTree;
//此题和判断镜像是一样的思路，就是判断左右节点上不一样
public class _100_sameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        //递归出口
        if(p==null||q==null){
            return p==null&&q==null?true:false;
        }
        //递归出口与递归函数相互混用的情况
        return p.val==q.val&&isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);
    }
}
