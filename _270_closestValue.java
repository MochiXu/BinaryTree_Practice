package BinaryTree;

//返回BST中最接近target的元素

//这个题目写的麻烦了，具体可以参照题解
public class _270_closestValue {
    //直接利用BST的性质，左<中<右
    public int closestValue(TreeNode root, double target) {
        //在右侧寻找
        if (root.val < target) {
            if (root.right == null) return root.val;
            return Math.abs(root.val - target) > Math.abs(inOrderFirst(root.right) - target) ? closestValue(root.right, target) : root.val;
        }
        //在左侧寻找
        if (root.val > target) {
            if (root.left == null) return root.val;
            return Math.abs(root.val - target) > Math.abs(inOrderLast(root.left) - target) ? closestValue(root.left, target) : root.val;
        }
        return root.val;
    }
    //中序遍历的最后一个结点
    public int inOrderLast(TreeNode root) {
        while (root.right != null)
            root = root.right;
        return root.val;
    }
    //中序遍历的第一个结点
    public int inOrderFirst(TreeNode root) {
        while (root.left != null)
            root = root.left;
        return root.val;
    }


}
