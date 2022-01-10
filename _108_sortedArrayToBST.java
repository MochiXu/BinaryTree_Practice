package BinaryTree;
//将有序数组转换为二叉树
public class _108_sortedArrayToBST {
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length==0) return null;
        return sortedSubArray(nums,0,nums.length-1);
    }
    public TreeNode sortedSubArray(int [] nums,int i,int j){
        //递归出口函数
        if(nums.length==0||i>j)return null;
        if(i==j){
            TreeNode treeNode=new TreeNode();
            treeNode.val=nums[i];
            return treeNode;
        }
        //递归函数
        int k=(i+j)/2;
        TreeNode root=new TreeNode();
        root.val=nums[k];
        root.left=sortedSubArray(nums,i,k-1);
        root.right=sortedSubArray(nums,k+1,j);
        return root;
    }
}
