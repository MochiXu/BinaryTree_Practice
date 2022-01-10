package BinaryTree;
//返回二叉树的直径
//思路：判断每个结点的左右子树上的叶子结点之间的距离，与max进行更新
public class _543_diameterOfBinaryTree {
    int max=0;
    public int diameterOfBinaryTree(TreeNode root) {
        //所有结点的左子树最大深度+右子树最大深度+1的最大值就是直径
        subDiameter(root);
        return max;
    }
    public void subDiameter(TreeNode root){
        if(root==null)return;
        int deep_l=depth(root.left);
        int deep_r=depth(root.right);
        max=Math.max(max,deep_l+deep_r+1);

        subDiameter(root.left);
        subDiameter(root.right);
    }

    public int depth(TreeNode root){
        //返回最大深度
        if(root==null)return 0;
        //左右深度
        int l=depth(root.left);
        int r=depth(root.right);
        //返回最大深度
        return l>r?l+1:r+1;
    }


}
