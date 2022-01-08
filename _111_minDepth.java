package BinaryTree;

public class _111_minDepth {
    public int minDepth(TreeNode root) {
        if(root!=null&&(root.left==null||root.right==null)){
            if(root.left==null&&root.right==null)
                return 1;
            else if(root.left==null)return minDepth(root.right)+1;
            else if(root.right==null)return minDepth(root.left)+1;
        }

        if (root == null) {
            return 0;
        }
        int left = minDepth(root.left);
        int right = minDepth(root.right);
        return left > right ? right + 1 : left + 1;
    }
}
